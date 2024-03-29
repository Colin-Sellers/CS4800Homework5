package Decorator;

public class Burger implements FoodItem
{
    private float basePrice = 4.99F;
    private String itemName = "Burger";

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
