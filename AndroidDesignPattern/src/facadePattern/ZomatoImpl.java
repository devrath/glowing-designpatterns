package facadePattern;

public class ZomatoImpl implements ZomatoFacade{

    private final ChickenBurger chickenBurger;
    private final PopcornChicken popcornChicken;
    private final VegBurger vegBurger;

    public ZomatoImpl(){
        chickenBurger = new ChickenBurger();
        popcornChicken = new PopcornChicken();
        vegBurger = new VegBurger();
    }

    @Override
    public void provideChickenBurger() {
        chickenBurger.provideFood();
    }

    @Override
    public void providePopcornChicken() {
        popcornChicken.provideFood();
    }

    @Override
    public void provideVegBurger() {
        vegBurger.provideFood();
    }

}
