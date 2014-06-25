package exportInfo;
/*
 * The class ExportFormat create PlainText or Pdf object according to user's choice
 */


public class ExportFormat {

	public void export(StringBuffer details, String name,String format)
	{
		switch(format.toLowerCase())
		{
		   //Creates an object of PlainText 
		   case "plain text":PlainText pl=new PlainText();
		          pl.exportData(details,name);
		          break;
		          
		   //Creates an object of Pdf
		   case "pdf":Pdf pd=new Pdf();
		          pd.exportData(details,name);
		           break;
		   			
		   default: System.out.print("Invalid choice");
		}
		
	}
	
}
