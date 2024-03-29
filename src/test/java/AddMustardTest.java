import Decorator.AddMustard;
import Decorator.Burger;
import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddMustardTest
{
    FoodItem foodItemForMustard = new Burger();
    FoodItem foodItemWithMustard = new AddMustard(foodItemForMustard);
    @Test
    public void addCheeseTest()
    {
        String expected = "Burger and Mustard";
        FoodItem foodItem = new Burger();
        foodItem = new AddMustard(foodItem);
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetFoodItemTest()
    {
        String expected = "Burger and Mustard";
        foodItemWithMustard.setItemName("Burger and Mustard");
        String actual = foodItemWithMustard.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetBasePriceTest()
    {
        float expected = 5.49F;
        foodItemWithMustard.setBasePrice(5.49F);
        float actual = foodItemWithMustard.getItemCost();
        assertEquals(expected, actual);
    }
}
