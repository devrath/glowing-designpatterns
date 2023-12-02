package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        // Creating the factory instance: -> Observe We just pass Type
        CoffeeFactory factory = new CoffeeFactory(CoffeeType.COFFEE_AMERICANO);
        // We create the coffee from factory object
        Coffee coffee = factory.getCoffee();
        // Now we can access the implementations of factory
        System.out.println("CoffeeName:-> "+coffee.name());
        System.out.println("CoffeeStatusIsItHot:-> "+coffee.isHot());
    }
}