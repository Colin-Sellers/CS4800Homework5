package Decorator;

public class Customer
{
    // Loyalty_discount is a percent value to take off total cost of order
    // 1 = no loyalty
    private float loyaltyDiscount = 0.0F;

    public Customer(String loyaltyStatus)
    {
        setLoyalty_discount(loyaltyStatus);
    }
    public void setLoyalty_discount(String loyaltyStatus)
    {
        if (loyaltyStatus.equals("Member"))
        {
            loyaltyDiscount = 0.95F; // 5% discount
        }
        else if (loyaltyStatus.equals("Super Member"))
        {
            loyaltyDiscount = 0.9F; // 10% discount
        }
        else
        {
            // Assume any incorrect input is referring to non-member status
            loyaltyDiscount = 1.0F; // Any number * 1 is same, thus no discount
        }
    }

    public float getLoyalty_discount()
    {
        return loyaltyDiscount;
    }

    public String getLoyaltyStatus()
    {
        if (loyaltyDiscount == 0.95F)
        {
            return "Member, 5% discount";
        }
        else if (loyaltyDiscount == 0.9F)
        {
            return "Super Member, 10% discount";
        }
        else
        {
            return "Non-Member, 0% discount";
        }
    }
}
