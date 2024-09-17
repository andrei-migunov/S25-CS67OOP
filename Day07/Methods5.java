import java.util.Scanner;

public class Methods5 {
 
    public static String liquidSolidGas(double tempCelsius) {
        if (tempCelsius < 0) {
            return "Solid";
        }
        else if (tempCelsius > 100) {
            return "Gas";
        }
        else {
            return "Liquid";
        }
    }

    public static double toCelsius(int fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the temperature in Fahrenheit?");
        int temp = keyboard.nextInt();
        double c = toCelsius(temp);
        System.out.printf("%d degrees Fahrenheit equals %.2f degrees Celsius.\n", temp, c);
        keyboard.close();
    }

}
