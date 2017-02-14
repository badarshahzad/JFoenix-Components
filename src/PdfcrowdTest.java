import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import com.pdfcrowd.*;
import java.io.*;

public class PdfcrowdTest {
    public static void main(String[] args) {
    	 try {
    	
             String k = "<html><body> This is my Project </body></html>";

             OutputStream file = new FileOutputStream(new File("test4.pdf"));

             Document document = new Document();
             PdfWriter.getInstance(document, file);

             document.open();
             HTMLWorker htmlworker = new HTMLWorker(document);
             htmlworker.parse(new StringReader(k));
             
             document.close();
             file.close();

         } catch (Exception e) {

             e.printStackTrace();
         }
    }
}