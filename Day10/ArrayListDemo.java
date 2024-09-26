import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
        
        // add some strings
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // print them out -- all on one line
        System.out.println(cars);

        System.out.println("---------------");

        // traditional for loop
        for (int i=0; i<cars.size(); i++) {
            System.out.println(i + " " + cars.get(i));
        }

        System.out.println("---------------");

        // a for-each loop
        for (String car : cars) {
            System.out.println(car);
        }
    }
}
