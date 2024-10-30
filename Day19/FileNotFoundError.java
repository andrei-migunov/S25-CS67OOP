/**
 * Example of an IOException -- FileNotFoundException
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundError{
	public static void main (String[] args) throws FileNotFoundException{
			File file = new File("MyFile.txt");
			Scanner inputFile = new Scanner(file);
			inputFile.close();
	}
}