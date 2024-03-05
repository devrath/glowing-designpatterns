package facadePattern;

public class VegBurger implements IkfcBrand{
    @Override
    public void provideFood() {
        System.out.println("VegBurger is cooked and provided");
    }
}
