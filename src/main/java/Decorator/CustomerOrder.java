package Decorator;
import java.util.ArrayList;

public class CustomerOrder
{
    private Customer customer;
    private ArrayList<FoodItem> order = new ArrayList<>();

    // An order must be linked to a customer
    public CustomerOrder(Customer customer)
    {
        this.customer = customer;
    }
    public void addToOrder(FoodItem addingItem)
    {
        order.add(addingItem);
    }
    public void addToppings(int item, ToppingBuilder addingToppings)
    {

        order.set(item, addingToppings.addToppings(order.get(item)));
    }
    public String getEntireOrder()
    {
        return "Your order:\n" + getOrder() + "Loyalty Discount: " +
                customer.getLoyaltyStatus() + "\n\nTotal Cost: $" + getTotalCost() + "\n";
    }
    private String getOrder()
    {
        StringBuilder entireOrder = new StringBuilder();
        int counter = 1;
        for ( FoodItem item : order)
        {
            entireOrder.append(counter).append(") ").append(item.getItemName()).append(" : $").append(item.getItemCost()).append("\n");
            counter++;
        }
        return entireOrder.toString();
    }

    private float getTotalCost()
    {
        float totalCost = 0.0F;
        for ( FoodItem item : order)
        {
            totalCost = totalCost + item.getItemCost();
        }
        totalCost = (float) Math.round((totalCost * customer.getLoyalty_discount()) * 100) /100;
        return totalCost;
    }
}
