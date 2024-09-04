import java.util.Scanner;

public class ScannerFinicky {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        // String before int -- no problem.

        String name;
        int number;
        System.out.println("String before int -- no problem.");

        System.out.println("Enter a name: ");
        name = keyboard.nextLine();
        System.out.println("Enter a number: ");
        number = keyboard.nextInt();
        System.out.println("Name: " + name + "  Number: " + number);   
        
        // int before String -- problem
        System.out.println("int before String -- Problem.");

        System.out.println("Enter a number: ");
        number = keyboard.nextInt();
        //keyboard.nextLine(); // need to read \n after integer
        System.out.println("Enter a name: ");
        name = keyboard.nextLine();
        System.out.println("Name: " + name + "  Number: " + number);
        keyboard.close();
    }
}
