/**
 * Represents a customer in the DVD rental database.
 * Stores basic customer information, including their ID, first name, and last name.
 */
public class Customer {

    private int customerID; // Unique identifier for the customer
    private String firstName; // The customer's first name
    private String lastName;  // The customer's last name

    /**
     * Constructs a new {@code Customer} object with the specified details.
     *
     * @param cID the unique ID of the customer
     * @param fn  the first name of the customer
     * @param ln  the last name of the customer
     */
    public Customer(int cID, String fn, String ln) {
        customerID = cID;
        firstName = fn;
        lastName = ln;
    }

    /**
     * Returns a string representation of the {@code Customer} object.
     *
     * @return a string in the format "Customer [customerID]: [firstName] [lastName]"
     */
    public String toString() {
        return "Customer " + customerID + ": " + firstName + " " + lastName;
    }
}