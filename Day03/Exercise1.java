import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        int people;
        double bill;
        double amountPerPerson;

        System.out.println("Please enter the number of people: ");
        people = keyboard.nextInt();

        System.out.println("Please enter the total of the bill: ");
        bill = keyboard.nextDouble();
        bill = bill*1.20; //20% tip

        System.out.println("With a 20 percent tip, the total bill is " + bill);
        amountPerPerson = bill / people;
        System.out.println("Each person owes $" + amountPerPerson);
        keyboard.close();

    }
}
