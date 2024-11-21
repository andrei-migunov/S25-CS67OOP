import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class demonstrates basic database operations on a DVD rental database using JDBC.
 * It includes methods to query customer information based on various criteria.
 */
public class DVDDatabaseExample
{
    /**
     * Prints all customers from the database.
     *
     * @param conn the database connection
     * @throws SQLException if a database access error occurs
     */
    public static void printCustomers(Connection conn) throws SQLException
    {
        String query = "SELECT customer_id, first_name, last_name FROM customer";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next())
        {
            int custID = rs.getInt("customer_id");
            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");

            System.out.println("Customer "+custID+": "+firstName+" "+lastName);
        }
    }

    /**
     * Prints customers with a specified last name from the database.
     *
     * @param conn     the database connection
     * @param lastName the last name of the customers to retrieve
     * @throws SQLException if a database access error occurs
     */
    public static void printCustomersByLastName(Connection conn, String lastName) throws SQLException
    {
        String query = String.format("SELECT customer_id, first_name, last_name FROM customer WHERE last_name = '%s'",lastName);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next())
        {
            int custID = rs.getInt("customer_id");
            String firstName = rs.getString("first_name");

            System.out.println("Customer "+custID+": "+firstName+" "+lastName);
        }
    }

    /**
     * Retrieves a list of customers with a specified last name.
     *
     * @param conn     the database connection
     * @param lastName the last name of the customers to retrieve
     * @return an {@code ArrayList} of {@code Customer} objects representing the customers with the specified last name
     * @throws SQLException if a database access error occurs
     */
    public static ArrayList<Customer> getCustomersByLastName(Connection conn, String lastName) throws SQLException
    {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        String query = String.format("SELECT customer_id, first_name, last_name FROM customer WHERE last_name = '%s'",lastName);

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while(rs.next())
        {
            int custID = rs.getInt("customer_id");
            String firstName = rs.getString("first_name");

            Customer currCustomer = new Customer(custID,firstName,lastName);
            customerList.add(currCustomer);
        }

        return customerList;
    }

     /**
     * Main method to demonstrate database operations.
     *
     * @param args command-line arguments (not used)
     * @throws SQLException if a database access error occurs
     */
    public static void main(String[] args) throws SQLException
    {
        // Path to the Sakila database
        String dbUrl = "jdbc:sqlite:sqlite-sakila.db";
        Connection conn = DriverManager.getConnection(dbUrl);
        
        printCustomers(conn);
        //printCustomersByLastName(conn,"HOLMES");
        //printRentalsByCustomerId(conn,145);
        //System.out.println( getCustomersByLastName(conn,"HOLMES") ); 

        //HashMap<String,Film> filmMap = getFilmMap(conn);
        //System.out.println(filmMap.get("HOBBIT ALIEN"));
        //System.out.println(filmMap.get("SUGAR WONKA"));


    }
}