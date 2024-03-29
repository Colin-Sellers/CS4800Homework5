import Decorator.FoodItem;
import Decorator.Burger;
import Decorator.ToppingBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ToppingBuilderTest
{
    ToppingBuilder builder = new ToppingBuilder();
    @Test
    public void addToppingsTest()
    {
        String expected = "Burger and Cheese and Mayo";
        FoodItem foodItem = new Burger();
        foodItem = builder.addCheese().addMayo().addToppings(foodItem);
        String actual = foodItem.getItemName();
        assertEquals(expected, actual);
    }
}
