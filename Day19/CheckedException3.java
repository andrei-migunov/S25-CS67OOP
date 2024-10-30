/**
 * Example to illustrate a Checked Exception in java
 * Java will will not allow an un-caught IOException to run (syntax error)
 * Note: This code shows how the "buck can be passed" by putting the exception
 *   handling in the function definitions -- including the main method.
 *   In this case, if the file is not found, the program will crash.
 */

 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException3 {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "neato.txt";
		displayFile(fileName);
	}
	
	public static void displayFile(String name) throws FileNotFoundException
	{
		File file = new File(name);
		Scanner inputFile = new Scanner(file);
		while(inputFile.hasNext())
		{
			System.out.println(inputFile.nextLine());
		}	
		inputFile.close();
	}
}