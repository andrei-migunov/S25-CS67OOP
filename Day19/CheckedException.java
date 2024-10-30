/**
 * Example to illustrate a Checked Exception in java
 * Java will will not allow an un-caught IOException to run (syntax error)
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

	public static void main(String[] args) {
		String fileName = "neato.txt";
		displayFile(fileName);
	}
	
	public static void displayFile(String name)
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