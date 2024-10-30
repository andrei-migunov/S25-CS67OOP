/**
 * Example of useing try-catch-finally
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {

	public static void main(String[] args) {
		try {
			File file = new File("Numbers.txt");
			Scanner inputFile = new Scanner(file);
			
			try {
				while(inputFile.hasNext())
				{
					System.out.println(inputFile.nextDouble());
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid data found.");
				return;
			}
			finally {
				System.out.println("Numbers.txt is closing...");
				inputFile.close();
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}
}