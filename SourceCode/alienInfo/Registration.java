package alienInfo;

/**
* The Registration program implements an application 
* that accepts details of an alien and exports to 
* a plain text or pdf
* 
* @author  Deepthi P
*/


import java.util.Scanner;

import exportInfo.ExportFormat;


public class Registration
{
	
	static Scanner scanner = new Scanner(System.in);
	static StringBuffer details;
	static String name;
	
	/*
	 * The main method reads the user details and make use of PlainText , Pdf classes
	 */
	public static void main(String[] args)
	{
		
		System.out.println("Welcome To Earth !!\n\nPlease Register Your Details \n\n");
	    
		//Reads alien details from console
		readData();
				
		//Prints the menu for file format
		System.out.println("Would you like to export to:\n1.Plain text\n2.PDF\n");
		String format = scanner.nextLine();
		
		//Exports data to given format using ExportInfo module
		ExportFormat exportFormat=new ExportFormat();
		exportFormat.export(details,name,format);
		
		
		scanner.close();
		
	}
	
	public static void readData()
	{
	
		
		//Reads the details from user and appends to the string buffer
		
		
		System.out.println("Name:");
		name = scanner.nextLine();
		details=new StringBuffer("Name:"+name)
		.append(System.getProperty("line.separator"));
		
		System.out.println("Blood Color:");
		details.append("Blood Color:"+scanner.nextLine())
		.append(System.getProperty("line.separator"));
		
		System.out.println("No Of Antennas:");
		details.append("No Of Antennas:"+scanner.nextInt())
		.append(System.getProperty("line.separator"));
		
		System.out.println("No Of Legs:");
		details.append("No Of Legs:"+scanner.nextInt())
		.append(System.getProperty("line.separator"));
		
		scanner.nextLine();
		
		System.out.println("Home Planet:");
		details.append("Home Planet:"+scanner.nextLine());
				
		       
	}
}

