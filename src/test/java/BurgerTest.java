import Decorator.Burger;
import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BurgerTest
{
    FoodItem foodItem = new Burger();

    @Test
    public void getItemNameTest()
    {
        String expected = "Burger";
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void getItemCostTest()
    {
        float expected = 4.99F;
        float actual = foodItem.getItemCost();
        assertEquals(expected, actual);
    }

    @Test
    public void setItemNameTest()
    {
        String expected = "Burger";
        foodItem.setItemName("Burger");
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setBasePriceTest()
    {
        float expected = 4.99F;
        foodItem.setBasePrice(4.99F);
        float actual = foodItem.getItemCost();
        assertEquals(expected, actual);
    }
}
