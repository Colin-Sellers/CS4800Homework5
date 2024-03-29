import Decorator.Fries;
import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriesTest
{
    FoodItem foodItem = new Fries();

    @Test
    public void getItemNameTest()
    {
        String expected = "Fries";
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void getItemCostTest()
    {
        float expected = 1.50F;
        float actual = foodItem.getItemCost();
        assertEquals(expected, actual);
    }

    @Test
    public void setItemNameTest()
    {
        String expected = "Fries";
        foodItem.setItemName("Fries");
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setBasePriceTest()
    {
        float expected = 1.50F;
        foodItem.setBasePrice(1.50F);
        float actual = foodItem.getItemCost();
        assertEquals(expected, actual);
    }
}
