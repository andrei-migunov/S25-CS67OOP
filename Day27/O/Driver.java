package O;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Guitar> guitars = new ArrayList<Guitar>();
        
        Guitar myFender = new Guitar("Fender", "Stratocaster", 5);
        Guitar myGibson = new Guitar("Gibson", "Les Paul", 12);

        guitars.add(myFender);
        guitars.add(myGibson);

        try {
			FileOutputStream outStream = new FileOutputStream("GuitarCollection.dat");
			ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
			
			//Serialize the guitars object
			objectOutputFile.writeObject(guitars);			
			objectOutputFile.close();
		}
		catch(IOException e) {
			System.out.println("A problem arose during serialization.");
		}

    }
}
