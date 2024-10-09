import java.util.ArrayList;

public class GroceryList extends ArrayList<GroceryItem>
{
    public double totalCost()
    {
        double total = 0.0;
        for(GroceryItem item : this)
        {
            total += item.getPrice();
        }
        return total;
    }

    // the @Override annotation tells the compiler we intend to override
    // the add method from ArrayList
    /* 
    @Override
    public boolean add(GroceryItem item) {

        // Don't allow items with negative prices
        if (item.getPrice() < 0) {
            System.out.println("Invalid item price: " + item.getPrice() + ". Item not added.");
            return false; 
        }
        System.out.println("Adding item: " + item);

        // Call the parent class's add method to actually add the item
        return super.add(item); 
    }
    */
}
