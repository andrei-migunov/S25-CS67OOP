import java.io.*;

public class FileWriting {
    public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("StudentData.txt",true);
		PrintWriter outputFile = new PrintWriter(fw);
		outputFile.println("Name: Bill, Age: 20, Major: CS");
		outputFile.println("Name: Amanda, Age: 23, Major: Math");
		outputFile.close();
	}
}