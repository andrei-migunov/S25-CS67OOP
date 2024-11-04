/**
 * This program demonstrates how to serialize a Bank Account object.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream outStream = new FileOutputStream("BankAccount.dat");
			ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
			
			//A new bank account
			BankAccount account = new BankAccount(5000.00, "Jim Bob", "123 Cool Ave.", 123456789);
			
			//Serialize the account object
			objectOutputFile.writeObject(account);			
			objectOutputFile.close();
		}
		catch(IOException e) {
			System.out.println("A problem arose during serialization.");
			System.out.println(e);
		}
	}

}
