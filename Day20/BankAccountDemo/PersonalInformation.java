/**
 * PersonalInformation.java
 * A class that can be serialized that contains personal information (name, address, SSN).
 */

import java.io.Serializable;

public class PersonalInformation implements Serializable {
	private String name;
	private String address;
	private int SSN; //could be declared transient (which wouldn't be serialized)
	
	/**
	 * Constructs a new PersonalInformation object with the given name, address, and SSN.
	 * @param n
	 * @param a
	 * @param ssn
	 */
	public PersonalInformation(String n, String a, int ssn) {
		setName(n);
		setAddress(a);
		setSSN(ssn);
	}
	
	/**
	 * Returns the name of the person.
	 * @return the name of the person
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the address of the person.
	 * @return	the address of the person
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * Returns the SSN of the person.
	 * @return the SSN of the person
	 */
	public int getSSN() {
		return SSN;
	}


	/**
	 * Sets the name of the person.
	 * @param n the new name 	
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * Sets the address of the person.
	 * @param a the new address
	 */
	public void setAddress(String a) {
		address = a;
	}
	
	/**
	 * Sets the SSN of the person.
	 * @param ssn the new SSN
	 */
	public void setSSN(int ssn) {
		SSN = ssn;
	}
}
