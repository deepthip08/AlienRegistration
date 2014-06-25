package exportInfo;
/**
 * The PlainText class is to export the alien details to a plain text. It implements EportUtility interface.
 */



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.StringTokenizer;


public class PlainText implements ExportUtility
{
    
    public void exportData(StringBuffer stg, String name)
    {
    	try
   	    {    
       
    		FileWriter fileWriter = new FileWriter(name+".txt");

    		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
       
    		bufferedWriter.write(stg.toString());
       
    		bufferedWriter.flush();
    		
    		System.out.println("Your registration has been successful!!");
       
   	 }catch(Exception e)
	  {
		  e.printStackTrace();
	  } 
        
    }
}
