public class GroceryItem
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
    
}
