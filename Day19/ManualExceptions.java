/**
 * Example of throwing an exception manually
 */

public class ManualExceptions {

    public static void main(String[] args) {
        System.out.println("I'm going to throw an RuntimeException because I can.");
        throw new RuntimeException();
    }
}