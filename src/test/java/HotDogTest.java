import Decorator.HotDog;
import Decorator.FoodItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotDogTest
{
    FoodItem foodItem = new HotDog();

    @Test
    public void getItemNameTest()
    {
        String expected = "Hot dog";
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void getItemCostTest()
    {
        float expected = 3.99F;
        float actual = foodItem.getItemCost();
        assertEquals(expected, actual);
    }

    @Test
    public void setItemNameTest()
    {
        String expected = "Hot dog";
        foodItem.setItemName("Hot dog");
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }

    @Test
    public void setBasePriceTest()
    {
        float expected = 3.99F;
        foodItem.setBasePrice(3.99F);
        float actual = foodItem.getItemCost();
        assertEquals(expected, actual);
    }
}
