import Decorator.AddMayo;
import Decorator.Burger;
import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddMayoTest
{
    FoodItem foodItemForMayo = new Burger();
    FoodItem foodItemWithMayo = new AddMayo(foodItemForMayo);
    @Test
    public void addCheeseTest()
    {
        String expected = "Burger and Mayo";
        FoodItem foodItem = new Burger();
        foodItem = new AddMayo(foodItem);
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetFoodItemTest()
    {
        String expected = "Burger and Mayo";
        foodItemWithMayo.setItemName("Burger and Mayo");
        String actual = foodItemWithMayo.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetBasePriceTest()
    {
        float expected = 5.74F;
        foodItemWithMayo.setBasePrice(5.74F);
        float actual = foodItemWithMayo.getItemCost();
        assertEquals(expected, actual);
    }
}
