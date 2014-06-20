
/**
* The Registration program implements an application 
* that accepts details of an alien and exports to 
* a plain text or pdf
* 
* @author  Deepthi P
*/



import java.util.Scanner;

public class Registration
{
	
	/*The main method reads the user details and make use of PlainText , Pdf classes
	 */
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome To Earth !!\n\nPlease Register Your Details \n\n");
		
		//Reads the details from user
		System.out.println("Name:");
		String name = scanner.nextLine();
		System.out.println("Blood Color:");
		String bloodColor = scanner.nextLine();
		System.out.println("No Of Antennas:");
		int antennas = scanner.nextInt();
		System.out.println("No Of Legs:");
		int legs = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Home Planet:");
		String planet = scanner.nextLine();
		
		//Prints the menu for file format
		System.out.println("Would you like to export to:\n1.Plain text\n2.PDF\n");
		int format = scanner.nextInt();
		
		switch(format)
		{
		   //Creates an object of PlainText when user's choice is 1
		   case 1:PlainText pl=new PlainText(name,bloodColor,antennas,legs,planet);
		          pl.export();
		          break;
		   //Creates an object of Pdf when user's choice is 2
		   case 2:Pdf pd=new Pdf(name,bloodColor,antennas,legs,planet);
		          pd.export();
		   		  break;
		   			
		   default: System.out.print("Invalid choice");
		}
		
		scanner.close();
		
	}
}

