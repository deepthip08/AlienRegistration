package exportInfo;
/**
 * The Pdf class is to export the alien details to a pdf. It implements EportUtility interface.
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf implements ExportUtility
{	

    public void exportData(StringBuffer stg, String name)
    {
	   
	  try
	  {
		 Document document = new Document();
	     PdfWriter.getInstance(document, new FileOutputStream(name+".pdf"));
	     document.open();
	     
	     document.add(new Paragraph(stg.toString()));
         
         document.close();
         
         System.out.println("Your registration has been successful!!");
	     
	  } catch (DocumentException e) {
	      e.printStackTrace();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }

    }
	
	
		
}
