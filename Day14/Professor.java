public class Professor extends Person{
	private String specialization;
	
	public Professor(String n, String s, int y, int m, int d)
	{
		super(n,y,m,d);
		specialization = s;
	}
	
	public String getSpecialization()
	{
		return specialization;
	}
	
	public void setSpecialization(String s)
	{
		specialization = s;
	}
	
	public String toString()
	{
		String returnString = "";
		returnString += "Professor: " + "\n";
		returnString += " name: " + name +  "\n";
		returnString += " age: " + getAge() + "\n";
		returnString += " specialization: " + specialization + "\n";
		return returnString;
	}
}
