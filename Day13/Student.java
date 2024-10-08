public class Student extends Person {
    private double gpa;

    public Student(String n, int a, double g) {
        super(n,a);
        gpa = g;
    }

    public void setGPA(double g) {
        gpa = g;
    }

    public double getGPA() {
        return gpa;
    }

    public void study() {
        gpa += 0.1;
    }

    public String toString() {
        String returnString = "";
        returnString += "STUDENT\n";
        returnString += "  name: " + getName() + "\n";
        returnString += "  age: " + getAge() + "\n";
        returnString += "  gpa: " + gpa + "\n";
        return returnString;
    }

}


