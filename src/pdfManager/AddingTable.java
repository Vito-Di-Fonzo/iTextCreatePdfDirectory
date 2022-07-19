package pdfManager;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;

public class AddingTable {
	public static void main(String args[]) throws Exception {
		// Creating a PdfDocument object
		String dest = "C:\\Users\\vitod\\OneDrive\\Desktop\\PDF\\addingList.pdf";
		PdfWriter writer = new PdfWriter(dest);

		// Creating a PdfDocument object
		PdfDocument pdf = new PdfDocument(writer);

		// Creating a Document object
		Document doc = new Document(pdf);

		// Creating a table
		float[] pointColumnWidths = { 150F, 150F, 150F };
		Table table = new Table(pointColumnWidths);

		// Adding cells to the table
		table.addCell(new Cell().add("Name"));
		table.addCell(new Cell().add("Raju"));
		table.addCell(new Cell().add("Id"));
		table.addCell(new Cell().add("1001"));
		table.addCell(new Cell().add("Designation"));
		table.addCell(new Cell().add("Programmer"));

		// Adding Table to document
		doc.add(table);

		// Closing the document
		doc.close();
		System.out.println("Table created successfully..");
	}
}

/*
 * package pdfManager; import java.io.File; import java.io.FileOutputStream;
 * import java.io.IOException;
 * 
 * import com.itextpdf.text.Document; import
 * com.itextpdf.text.DocumentException; import com.itextpdf.text.PageSize;
 * import com.itextpdf.text.Phrase; import com.itextpdf.text.pdf.PdfPCell;
 * import com.itextpdf.text.pdf.PdfPTable; import
 * com.itextpdf.text.pdf.PdfWriter;
 * 
 * 
 * 
 * 
 * public class CellHeights { /** The resulting PDF file. public static final
 * String DEST = "C:\\Users\\vitod\\OneDrive\\Desktop\\PDF\\Cekll.pdf"; public
 * static void main(String[] args) throws IOException, DocumentException { File
 * file = new File(DEST); file.getParentFile().mkdirs(); new
 * CellHeights().createPdf(DEST); }
 * 
 * public void createPdf(String dest) throws DocumentException, IOException { //
 * step 1 Document document = new Document(PageSize.A5.rotate()); // step 2
 * PdfWriter.getInstance(document, new FileOutputStream(dest)); // step 3
 * document.open(); // step 4 PdfPTable table = new PdfPTable(2); // a long
 * phrase Phrase p = new Phrase("Dr. iText or."); PdfPCell cell = new
 * PdfPCell(p); // the prhase is wrapped table.addCell("wrap");
 * cell.setNoWrap(false); table.addCell(cell); // the phrase isn't wrapped
 * table.addCell("no wrap"); cell.setNoWrap(true); table.addCell(cell); // a
 * long phrase with newlines p = new Phrase("Dr. iText  PDF."); cell = new
 * PdfPCell(p); // the phrase fits the fixed height
 * table.addCell("fixed height (more than sufficient)");
 * cell.setFixedHeight(72f); table.addCell(cell); // the phrase doesn't fit the
 * fixed height table.addCell("fixed height (not sufficient)");
 * cell.setFixedHeight(36f); table.addCell(cell); // The minimum height is
 * exceeded table.addCell("minimum height"); cell = new PdfPCell(new
 * Phrase("Dr. iText")); cell.setMinimumHeight(36f); table.addCell(cell); // The
 * last row is extended table.setExtendLastRow(true);
 * table.addCell("extend last row"); table.addCell(cell); document.add(table);
 * // step 5 document.close(); } }
 */