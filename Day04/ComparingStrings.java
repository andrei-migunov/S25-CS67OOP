import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        String team;

        System.out.println("What is your favorite team?");
        team = keyboard.nextLine();
        if (team == "Bulldogs") { ///this is a mistake
            System.out.println("Go Bulldogs");
        }
        keyboard.close();
    }
}
