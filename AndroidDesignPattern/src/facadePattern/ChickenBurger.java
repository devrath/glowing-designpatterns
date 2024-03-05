package facadePattern;

public class ChickenBurger implements IkfcBrand {
    @Override
    public void provideFood() {
        System.out.println("ChickenBurger is cooked and provided");
    }
}
