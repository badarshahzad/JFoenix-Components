package pdfConvert;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;

public class Html2Pdf {

	/**
	 * Get Source Code of a certain web page
	 * @param url
	 * @return html String
	 * @throws Exception
	 */
    public static String getDataFromUrl(String url) throws Exception {
        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader( yc.getInputStream()));
        String resultStr = "";
        String inputLine ;
        while ((inputLine = in.readLine()) != null)
            resultStr += inputLine;
        in.close();

        return resultStr;
     }
     
    /**
     * Generate Strict XHTML code to PDF
     * @param url
     * @param tempFile
     */
	  public static void htmlStringToPdfStream(String url, String tempFile) {
		 try {
			 	FileOutputStream pdf = new FileOutputStream(tempFile);
			 	String html = cleanHtml(url);
			 	System.out.println(html);
	            ITextRenderer renderer = new ITextRenderer();
	            renderer.setDocumentFromString(html);
	            renderer.layout();
	            renderer.createPDF(pdf);
	            
	 
	            pdf.close();
	 
		 } catch (Exception e) {
			 throw new RuntimeException(e);
		 }
	 }
	 
	  /**
	   * 
	   * @param url
	   * @return html String (Strict XML Format)
	   * @throws MalformedURLException
	   * @throws IOException
	   */
	 public static String cleanHtml(String url) {
		CleanerProperties props = new CleanerProperties();
		 
		// set some properties to non-default values
		props.setTranslateSpecialEntities(true);
		props.setTransResCharsToNCR(true);
		props.setOmitComments(true);
		HtmlCleaner htmlCleaner = new HtmlCleaner(props);
		
		// do parsing
		TagNode root;
		try {
			root = htmlCleaner.clean( new URL(url) );
			htmlCleaner.getInnerHtml(root);
			String html = "<" + root.getName() + ">" + htmlCleaner.getInnerHtml(root) + "</" + root.getName() + ">";
			return html;
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return "";
		} catch (IOException e) {
			
			e.printStackTrace();
			return "";
		}
		
		
	 }
	 
	 
	 /**
	  * Generate PDF file from a URL link
	  * @param url
	  * @param outputFileName
	  */
	 public static void genPdf(String url, String outputFileName) {
		 try {
			Process process=Runtime.getRuntime().exec("wkhtmltopdf "+url+" "+outputFileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
	 
	 public static void main(String[] args) throws MalformedURLException, IOException {
		 genPdf("https://github.com/zhouhao", "github.pdf");

	 }

}