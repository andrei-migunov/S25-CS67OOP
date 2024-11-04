import java.io.Serializable;

/**
   The BankAccount class simulates a bank account.
*/

public class BankAccount implements Serializable
{
   private double balance;      // Account balance
   private PersonalInformation info;

   /**
    * Constructs a new BankAccount object with the given starting balance and personal information.
    * @param startBalance the starting balance of the account
    * @param name the name associated with the account
    * @param address the address associated with the account
    * @param ssn the social security number associated with the account
    */
   public BankAccount(double startBalance, String name, String address, int ssn)
   {
      balance = startBalance;
      info = new PersonalInformation(name, address, ssn);
   }

   /**
    * Deposits the given amount into the account.
    * @param amount the amount to deposit
    */
   public void deposit(double amount)
   {
      balance += amount;
   }

   /**
   * Withdraws the given amount from the account.
   * @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      balance -= amount;
   }

   /**
    * Sets the balance of the account.
    * @param b the new balance
    */
   public void setBalance(double b)
   {
      balance = b;
   }

   /**
    * Returns the balance of the account.
    * @return the balance of the account
    */
   public double getBalance()
   {
      return balance;
   }

   /**
    * Returns the personal information associated with the account.
    */
   public String toString() {
      String returnString = "Name: " + info.getName() + "\n";
      returnString += "Address: " + info.getAddress() + "\n";
      returnString += "SSN: " + info.getSSN() + "\n";
      returnString += "Balance: " + getBalance() + "\n";
      return returnString;
   }
}
