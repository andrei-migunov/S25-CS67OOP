import java.util.Collections;

public class GroceryDriver 
{
    public static void main(String[] args) 
    {
        GroceryList shoppingList = new GroceryList();

        GroceryItem flour = new GroceryItem("Flour, 5 lbs", 4.57, 16);
        GroceryItem milk = new GroceryItem("Milk 1%", 2.75, 36);
        GroceryItem granola = new GroceryItem("Granola 11 oz.", 4.47, 19);
        GroceryItem peanutButter = new GroceryItem("Peanut Butter (creamy), 40 oz.", 3.98, 9);
        GroceryItem bread = new GroceryItem("Whole Wheat Sandwich Bread", 1.97,8);

        shoppingList.add(flour);
        shoppingList.add(milk);
        shoppingList.add(granola);
        shoppingList.add(peanutButter);
        shoppingList.add(bread);

        System.out.println(shoppingList);

        System.out.println("Total Cost: "+shoppingList.totalCost());

    }
}
