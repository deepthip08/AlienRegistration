/**
 * The PlainText class is to export the alien details to a plain text
 */



import java.io.BufferedWriter;
import java.io.FileWriter;


public class PlainText 
{
     
	String name,bloodColor,planet;
	int antennas,legs;
	
    public PlainText(String a, String b, int c, int d, String e)								
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
	   FileWriter fileWriter = new FileWriter(name+".txt");

       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
     
       bufferedWriter.write("Details Of "+name);
       bufferedWriter.flush();
       bufferedWriter.newLine();
       bufferedWriter.newLine();
       bufferedWriter.write("Blood Color: "+bloodColor);
       bufferedWriter.flush();
       bufferedWriter.newLine();
       bufferedWriter.write("No Of Antennas: "+antennas);
       bufferedWriter.flush();
       bufferedWriter.newLine();
       bufferedWriter.write("No Of Legs : "+legs);
       bufferedWriter.flush();
       bufferedWriter.newLine();
       bufferedWriter.write("Home Planet : "+planet);
       bufferedWriter.flush();
       bufferedWriter.newLine();
       
       bufferedWriter.close();
       
       System.out.println("Your registration has been successful!!");
       
	  }catch(Exception e)
	  {
		  e.printStackTrace();
	  }

   }
}
