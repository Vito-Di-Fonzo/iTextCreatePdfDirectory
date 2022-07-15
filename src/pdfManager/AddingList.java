package pdfManager;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.List;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

public class AddingList {
	public static void main(String args[]) throws Exception {

		Document document = new Document();

		// Creating a PdfWriter
		String destinazione = "C:\\Users\\vitod\\OneDrive\\Desktop\\PDF\\addingList.pdf";
		PdfWriter.getInstance(document, new FileOutputStream(destinazione));

		document.open();

		new PdfDocument();

		new PdfDocument();

		// Creating a Paragraph
		Paragraph paragraph = new Paragraph("Tutorials Point provides the following tutorials");

		// Creating a list
		List list = new List();

		// Add elements to the list
		list.add("Java");
		list.add("JavaFX");
		list.add("Apache Tika");
		list.add("OpenCV");
		list.add("WebGL");
		list.add("Coffee Script");
		list.add("Java RMI");
		list.add("Apache Pig");

		// Adding paragraph to the document
		document.add(paragraph);

		// Adding list to the document
		document.add(list);

		// Closing the document
		document.close();
		System.out.println("Lista Aggiunta correttamente");
	}
}