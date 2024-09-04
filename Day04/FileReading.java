import java.io.*;

import java.util.Scanner;

public class FileReading {
	
    public static void main(String[] args) throws IOException {

		File myFile = new File("Data.txt");
		Scanner inputFile = new Scanner(myFile);

		double x,y,z, sum;

		x = inputFile.nextDouble();
		y = inputFile.nextDouble();
		z = inputFile.nextDouble();
		sum = x + y + z;
		System.out.println(sum);

		inputFile.close();
	}
}