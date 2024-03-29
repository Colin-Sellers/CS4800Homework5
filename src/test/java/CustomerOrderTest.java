import Decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CustomerOrderTest
{
    Customer customer = new Customer("Member");
    CustomerOrder order = new CustomerOrder(customer);

    @Test
    public void orderTest()
    {
        String expected = "Your order:\n1) Burger and Cheese : $6.98\nLoyalty Discount: Member, 5% discount\n\nTotal Cost: $6.63\n";
        order.addToOrder(new Burger());
        order.addToppings(0, new ToppingBuilder().addCheese());
        String actual = order.getEntireOrder();
        assertEquals(expected, actual);
    }
}
