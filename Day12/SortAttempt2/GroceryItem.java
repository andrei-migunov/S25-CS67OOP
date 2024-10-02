import java.lang.Comparable;

public class GroceryItem implements Comparable<GroceryItem>
{
    private String name;
    private double price;
    private int aisle;

    public GroceryItem(String n, double p, int a)
    {
        name = n;
        price = p;
        aisle = a;
    }

    public String toString()
    {
        String rVal = String.format("\n%s: %.2f; Aisle %d",name,price,aisle);
        return rVal;
    }

    
    public int compareTo(GroceryItem other)
    {
        if(price < other.price)
        {
            return -1;
        }
        else if(price == other.price)
        {
            return 0;
        }
        else 
        {
            return 1;
        }
    }
    
}
