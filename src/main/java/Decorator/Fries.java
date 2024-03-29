package Decorator;

public class Fries implements FoodItem
{
    private float basePrice = 1.50F;
    private String itemName = "Fries";

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public float getItemCost() {
        return basePrice;
    }

    @Override
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }

    @Override
    public void setBasePrice(float basePrice)
    {
        this.basePrice = basePrice;
    }
}
