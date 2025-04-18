
// This class models an Employee.
// There are problems in this code!


public class Employee {

   private String name;
   private int monthlySalary;
   private int age;

   public Employee(String n, int m, int a)
   {
	   name = n;
	   monthlySalary = m;
	   age = a;
   }
   
   public String getName() {
      return name;
   }
	
   public void setName(String n) {
      name = n;
   }
	
   public int getMonthlySalary() {
      return monthlySalary;
   }
	
   public void setMonthlySalary(int m) {
      monthlySalary = m;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int a) {
	  if(a < 0)
		  throw new ImproperAgeException();
      age = a;
   }
   
   public int yearlySalary()
   {
	   return getMonthlySalary() * 10;
   }
   
   public int yearsUntilRetirementAge()
   {
	   int yearsUntilRetirement = 65 - getAge();
	   return yearsUntilRetirement;
   }
   
   public boolean shouldEmployeeRetire()
   {
	   if(yearsUntilRetirementAge() > 0)
		   return true;
	   else
		   return false;
   }
}