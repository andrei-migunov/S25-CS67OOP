import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates the use of a Generic class, Person
 * with IDs of type String and Integer.
 */

public class Exercise1 {
    
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("goodbye");
        words.add("hello");
        words.add("watermellon");

        Collections.sort(words);
        System.out.println(words);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);

        //Collections.sort(numbers);
        System.out.println(numbers);        

        ArrayList<RocketShip> rockets= new ArrayList<RocketShip>();
        rockets.add(new RocketShip("Saturn I", 2, 30, 0));
        rockets.add(new RocketShip("Saturn II", 2, 12, 0));
        rockets.add(new RocketShip("Saturn III", 2, 40, 0));

        Collections.sort(rockets);
        System.out.println(rockets);
    }
}
