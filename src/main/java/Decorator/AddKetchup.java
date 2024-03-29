package Decorator;

public class AddKetchup extends Topping
{
    public AddKetchup(FoodItem foodItem)
    {
        foodItem.setItemName(foodItem.getItemName() + " and Ketchup");
        foodItem.setBasePrice((float) Math.round((foodItem.getItemCost() + 0.5)*100)/100);
        this.foodItem = foodItem;
    }

    @Override
    public String getItemName()
    {
        return super.getItemName();
    }

    @Override
    public float getItemCost()
    {
        return super.getItemCost();
    }

    @Override
    public void setItemName(String itemName)
    {
        foodItem.setItemName(itemName);
    }

    @Override
    public void setBasePrice(float basePrice)
    {
        foodItem.setBasePrice(basePrice);
    }
}
