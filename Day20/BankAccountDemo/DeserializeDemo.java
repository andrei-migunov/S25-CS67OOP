/**
 * This program demonstrates the deserialization of a BankAccount object.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		BankAccount acct;
		
		try {
			FileInputStream inStream = new FileInputStream("BankAccount.dat");
			ObjectInputStream objectInputFile = new ObjectInputStream(inStream);
			
			//Read the serialized object from the file
			acct = (BankAccount) objectInputFile.readObject();
			
			objectInputFile.close();			
			System.out.println(acct); //print it out!
		}
		catch(IOException e) {
			System.out.println("A problem arose during deserialization.");
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			System.out.println("The BankAccount class was not found.");
		}
	}

}
