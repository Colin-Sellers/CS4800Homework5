import Decorator.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest
{
    Customer customer = new Customer("");

    @Test
    public void testCustomerConstructor()
    {
        float expected = 0.95F;
        customer = new Customer("Member");
        float actual = customer.getLoyalty_discount();
        assertEquals(expected, actual);
    }
    @Test
    public void testSetGetLoyaltyDiscount()
    {
        float expected = 0.90F;
        customer.setLoyalty_discount("Super Member"); // Set
        float actual = customer.getLoyalty_discount(); // Get
        assertEquals(expected, actual);
    }

    @Test
    public void testSetGetLoyaltyStatus()
    {
        String expected = "Super Member, 10% discount";
        customer.setLoyalty_discount("Super Member"); // Set
        String actual = customer.getLoyaltyStatus(); // Get
        assertEquals(expected, actual);
    }
}
