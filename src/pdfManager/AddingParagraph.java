package pdfManager;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

public class AddingParagraph {
	public static void main(String args[]) throws Exception {

		Document document = new Document();

		// Creating a PdfWriter
		String destinazione = "C:\\Users\\vitod\\OneDrive\\Desktop\\PDF\\addingParagraph.pdf";
		PdfWriter.getInstance(document, new FileOutputStream(destinazione));

		document.open();

		new PdfDocument();

		// Creating a Document

		String para1 = "Tutorials Point originated from the idea that there exists a "
				+ "class of readers who respond better to online content and prefer to "
				+ "learn new skills at their own pace from the comforts of their drawing rooms.";

		String para2 = "The journey commenced with a single tutorial on HTML in 2006 "
				+ "and elated by the response it generated, we worked our way to adding "
				+ "fresh tutorials to our repository which now proudly flaunts a wealth of "
				+ "tutorials and allied articles on topics ranging from programming languages "
				+ "to web designing to academics and much more.";

		// Creating Paragraphs
		Paragraph paragraph1 = new Paragraph(para1);
		Paragraph paragraph2 = new Paragraph(para2);

		// Adding paragraphs to document
		document.add(paragraph1);
		document.add(paragraph2);

		// Closing the document
		document.close();
		System.out.println("Paragrafi aggiunti");
	}
}
