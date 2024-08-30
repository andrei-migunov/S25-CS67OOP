import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        int usDollars;
        double canadianDollars;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of US dollars: ");
        usDollars = keyboard.nextInt();

        canadianDollars = usDollars * 1.36;

        //non formatted
        System.out.println("$" + usDollars + " converts to $" + canadianDollars + "Canadian dollars.");

        //formatted
        System.out.printf("$%d converts to $%.2f Canadian dollars.\n",usDollars,canadianDollars);
        keyboard.close();

    }
}
