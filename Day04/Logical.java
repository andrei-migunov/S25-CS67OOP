import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        String make, model;
        int miles, price;

        Scanner keyboard = new Scanner(System.in); // declare and initialize Scanner
        System.out.println("Enter make: ");
        make = keyboard.nextLine();
        System.out.println("Enter model: ");
        model = keyboard.nextLine();
        System.out.println("Enter miles: ");
        miles = keyboard.nextInt();
        System.out.println("Enter price: ");
        price = keyboard.nextInt();
        miles += 1;
        if (make.equals("Honda")) {
            if (model.equals("Civic") || model.equals("Accord")) {
                if (50000 <= miles && miles <= 100000 ) {
                    if (price < 10000)
                    {
                        System.out.println("SOLD!");
                    }

                }
            }
        }

        keyboard.close();

    }
}
