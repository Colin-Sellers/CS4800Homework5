package Decorator;

public class DecoratorRunner
{
    public static void main(String[] args)
    {
        // Generate some customers
        Customer customer1 = new Customer("Non Member"); // No Customer Loyalty
        Customer customer2 = new Customer("Member"); // 5% discount
        Customer customer3 = new Customer("Super Member"); // 10% discount

        // Create some orders
        CustomerOrder order1 = new CustomerOrder(customer1); // Link order to this customer
        order1.addToOrder(new Burger()); // Leave Basic
        order1.addToOrder(new Fries());
        order1.addToppings(1, new ToppingBuilder().addKetchup()); // Add toppings to fries
        order1.addToOrder(new Burger());
        order1.addToppings(2, new ToppingBuilder().addCheese().addMayo()); // Change second burger

        // Ready to order
        System.out.print(order1.getEntireOrder());
        System.out.println("==============================");

        CustomerOrder order2 = new CustomerOrder(customer2); // Link order to this customer
        order2.addToOrder(new HotDog());
        order2.addToOrder(new Fries());
        order2.addToOrder(new Fries());
        order2.addToOrder(new Burger());
        order2.addToOrder(new HotDog());
        order2.addToppings(1, new ToppingBuilder().addMustard());
        order2.addToppings(2, new ToppingBuilder().addCheese().addKetchup());
        order2.addToppings(3, new ToppingBuilder().addCheese());
        order2.addToppings(4, new ToppingBuilder().addMayo().addKetchup());

        // Ready to order
        System.out.print(order2.getEntireOrder());
        System.out.println("==============================");

        // Third customer gets same order as first customer, but with a 10% discount
        CustomerOrder order3 = new CustomerOrder(customer3);
        order3.addToOrder(new Burger()); // Leave Basic
        order3.addToOrder(new Fries());
        order3.addToppings(1, new ToppingBuilder().addKetchup()); // Add toppings to fries
        order3.addToOrder(new Burger());
        order3.addToppings(2, new ToppingBuilder().addCheese().addMayo()); // Change second burger

        // Ready to order
        System.out.print(order3.getEntireOrder());

    }
}
