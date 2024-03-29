package Decorator;

public abstract class Topping implements FoodItem
{
    FoodItem foodItem;

    @Override
    public String getItemName()
    {
        return foodItem.getItemName();
    }

    @Override
    public float getItemCost()
    {
        return foodItem.getItemCost();
    }

}

