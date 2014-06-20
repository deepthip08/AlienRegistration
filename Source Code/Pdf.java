/**
 * The Pdf class is to export the alien details to a pdf
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Pdf {

	
	String name,bloodColor,planet;
	int antennas,legs;
	
    public Pdf(String a, String b, int c, int d, String e)
    {
		    name=a;
		    bloodColor=b;
		    antennas=c;
		    legs=d;
		    planet=e;		    
    }
    
    public void export()
    {
	   
	  try
	  {
		 Document document = new Document();
	     PdfWriter.getInstance(document, new FileOutputStream(name+".pdf"));
	     document.open();
	     
	     document.add(new Paragraph("Details Of "+name));
         document.add( Chunk.NEWLINE );

	     document.add(new Paragraph("Blood Color: "+bloodColor));
	     document.add(new Paragraph("No Of Antennas: "+antennas));
	     document.add(new Paragraph("No Of Legs : "+legs));
	     document.add(new Paragraph("Home Planet : "+planet));
	     
         document.close();
         
         System.out.println("Your registration has been successful!!");
	     
	  } catch (DocumentException e) {
	      e.printStackTrace();
	    } catch (FileNotFoundException e) {
	      e.printStackTrace();
	    }

    }
	
	
		
}
