/**
 * Example of catching a FileNotFoundException
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class FileNotFound{
	public static void main (String[] args){
		try {
			File file = new File("MyFile.txt");
			Scanner inputFile = new Scanner(file);
			inputFile.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}		
	}
}