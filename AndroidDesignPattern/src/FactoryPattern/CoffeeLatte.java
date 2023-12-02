package FactoryPattern;

public class CoffeeLatte implements Coffee {
    @Override
    public String name() { return "CoffeeLatte"; }
    @Override
    public Boolean isHot() { return true; }
}