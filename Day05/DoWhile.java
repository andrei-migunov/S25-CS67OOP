import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        int x;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Enter a number: ");
            x = keyboard.nextInt();
        } while (x != 7);
        System.out.println("done!");
        keyboard.close();
    }
}
