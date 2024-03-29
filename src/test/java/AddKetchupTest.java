import Decorator.AddKetchup;
import Decorator.Burger;
import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddKetchupTest
{
    FoodItem foodItemForKetchup = new Burger();
    FoodItem foodItemWithKetchup = new AddKetchup(foodItemForKetchup);
    @Test
    public void addKetchupTest()
    {
        String expected = "Burger and Ketchup";
        FoodItem foodItem = new Burger();
        foodItem = new AddKetchup(foodItem);
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetFoodItemTest()
    {
        String expected = "Burger and Ketchup";
        foodItemWithKetchup.setItemName("Burger and Ketchup");
        String actual = foodItemWithKetchup.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetBasePriceTest()
    {
        float expected = 5.49F;
        foodItemWithKetchup.setBasePrice(5.49F);
        float actual = foodItemWithKetchup.getItemCost();
        assertEquals(expected, actual);
    }
}
