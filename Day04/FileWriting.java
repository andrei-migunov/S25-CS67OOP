import java.io.*;

public class FileWriting {
    public static void main(String[] args) throws IOException {
		PrintWriter outputFile = new PrintWriter("StudentData.txt");
		outputFile.println("Name: Gus, Age: 20, Major: CS");
		outputFile.println("Name: Amanda, Age: 23, Major: Math");
		outputFile.close();
	}
}