package Decorator;

public class HotDog implements FoodItem
{
    private float basePrice = 3.99F;
    private String itemName = "Hot dog";

    @Override
    public String getItemName()
    {
        return itemName;
    }

    @Override
    public float getItemCost()
    {
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
