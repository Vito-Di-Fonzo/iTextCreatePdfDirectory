package pdfManager;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class CreatePdf {

	public static void main(String args[]) throws FileNotFoundException, DocumentException {

		Document document = new Document();

		PdfWriter pdfWriter = PdfWriter.getInstance(document,
				new FileOutputStream("C:\\Users\\vitod\\OneDrive\\Desktop\\PDF\\PorocoDio.pdf"));

		document.open();

		document.add(new Paragraph("Hello World!"));

		document.close();

	}
}
