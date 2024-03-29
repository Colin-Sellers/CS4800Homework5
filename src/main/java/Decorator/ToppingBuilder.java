package Decorator;

public class ToppingBuilder
{
    public boolean Cheese;
    public boolean Ketchup;
    public boolean Mayo;
    public boolean Mustard;


    public ToppingBuilder addCheese()
    {
        Cheese = true;
        return this;
    }
    public ToppingBuilder addKetchup()
    {
        Ketchup = true;
        return this;
    }
    public ToppingBuilder addMayo()
    {
        Mayo = true;
        return this;
    }
    public ToppingBuilder addMustard()
    {
        Mustard = true;
        return this;
    }

    public FoodItem addToppings(FoodItem item)
    {
        if (Cheese) item = new AddCheese(item);
        if (Ketchup) item = new AddKetchup(item);
        if (Mayo) item = new AddMayo(item);
        if (Mustard) item = new AddMustard(item);
        return item;
    }
}
