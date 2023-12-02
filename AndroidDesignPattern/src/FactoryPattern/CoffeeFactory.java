package FactoryPattern;

public class CoffeeFactory {

    CoffeeType coffeeType;

    CoffeeFactory(CoffeeType coffeeType) {
        this.coffeeType = coffeeType;
    }

    public Coffee getCoffee(){
        if(coffeeType==CoffeeType.COFFEE_LATTE){
            return new CoffeeLatte();
        }else if(coffeeType==CoffeeType.COFFEE_AMERICANO) {
            return new CoffeeAmericano();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
