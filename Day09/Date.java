public class Date 
{
    private int month;
    private int day;
    private int year;
    
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }

    // Guarantees that if we try to print a Date object, it will look like ...
    public String toString()
    {
        return month+"/"+day+"/"+year;
    }


}
