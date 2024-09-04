import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int x;
        Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        
        System.out.println("Enter a number: ");
        x = keyboard.nextInt();
        if (x > 0) {
            System.out.println("x is positive");
        } 
        else if (x < 0) {
            System.out.println("x is negative");
        } 
        else {
            System.out.println("x is zero");
        }
        
        keyboard.close();
    }

}
