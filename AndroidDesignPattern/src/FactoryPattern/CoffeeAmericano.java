package FactoryPattern;

public class CoffeeAmericano implements Coffee {
    @Override
    public String name() { return "CoffeeAmericano";}
    @Override
    public Boolean isHot() { return false; }
}
