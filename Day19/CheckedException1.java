/**
 * Example to illustrate a Checked Exception in java
 * Java will will not allow an un-caught IOException to run (syntax error)
 * Note: This code shows how this exception can be caught
 */

 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException1 {

	public static void main(String[] args) {
		String fileName = "neato.txt";
		displayFile(fileName);
	}
	
	public static void displayFile(String name)
	{
		File file = new File(name);
		try {
			Scanner inputFile = new Scanner(file);
			while(inputFile.hasNext())
			{
				System.out.println(inputFile.nextLine());
			}
			inputFile.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}				

}