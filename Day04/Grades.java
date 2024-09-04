import java.util.Scanner;

public class Grades {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        int score;

        System.out.println("Enter a test score: ");
        score = keyboard.nextInt();
        if (score <  60) {
            System.out.println("Your grade is F.");
        } 
        else if (score <  70) {
            System.out.println("Your grade is D.");
        } 
        else if (score <  80) {
            System.out.println("Your grade is C.");
        } 
        else if (score <  90) {
            System.out.println("Your grade is B.");
        } 
        else {
            System.out.println("Your grade is A.");
        }
        
        keyboard.close();
    }
}
