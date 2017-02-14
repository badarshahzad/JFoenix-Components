package pdfConvert;

import java.io.FileOutputStream;
import java.io.StringReader;

public class Main {
	
	public static void main(String args[]){
		
		com.itextpdf.text.Document document =
		        new com.itextpdf.text.Document( com.itextpdf.text.PageSize.A4 );
		String fileNameWithPath = ("/home/badar/Desktop" + "PDF-HtmlWorkerParsed.pdf");
		FileOutputStream fos = new FileOutputStream( fileNameWithPath );
		com.itextpdf.text.pdf.PdfWriter pdfWriter =
		        com.itextpdf.text.pdf.PdfWriter.getInstance( document, fos );

		document.open();

		//**********************************************************
		// if required, you can add document meta data
		document.addAuthor( "Ravinder" );
		//document.addCreator( creator );
		document.addSubject( "HtmlWoker Parsed Pdf from iText" );
		document.addCreationDate();
		document.addTitle( "HtmlWoker Parsed Pdf from iText" );
		//**********************************************************/

		com.itextpdf.text.html.simpleparser.HTMLWorker htmlWorker =
		        new com.itextpdf.text.html.simpleparser.HTMLWorker( document );
		htmlWorker.parse( new StringReader( sb.toString() ) );

		document.close();
		fos.close();

		System.out.println( "File 3: '" + fileNameWithPath + "' created." );
	}

}
