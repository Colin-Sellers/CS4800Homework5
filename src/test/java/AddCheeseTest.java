
import Decorator.AddCheese;
import Decorator.Burger;
import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AddCheeseTest
{
    FoodItem foodItemForCheese = new Burger();
    FoodItem foodItemWithCheese = new AddCheese(foodItemForCheese);
    @Test
    public void addCheeseTest()
    {
        String expected = "Burger and Cheese";
        FoodItem foodItem = new Burger();
        foodItem = new AddCheese(foodItem);
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetFoodItemTest()
    {
        String expected = "Burger and Cheese";
        foodItemWithCheese.setItemName("Burger and Cheese");
        String actual = foodItemWithCheese.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setGetBasePriceTest()
    {
        float expected = 6.98F;
        foodItemWithCheese.setBasePrice(6.98F);
        float actual = foodItemWithCheese.getItemCost();
        assertEquals(expected, actual);
    }
}
