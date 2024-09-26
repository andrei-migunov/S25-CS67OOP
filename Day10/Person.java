public class Person
{
    String name;
    Date birthday;

    public Person(String n, Date bd)
    {
        name = n;
        birthday = bd;
    }

    public String toString()
    {
        return "Name: "+name+", Birthday: "+birthday;
    }
    
}
