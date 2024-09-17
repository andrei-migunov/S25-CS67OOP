import java.util.Scanner;

public class Methods2 {
 
    public static void greetings() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.nextLine();
        System.out.println("hello " + name);
        keyboard.close();
    }

    public static void main(String[] args) {
        System.out.println("here");
        greetings();
        System.out.println("goodbye");
    }

}
