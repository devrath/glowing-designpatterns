package facadePattern;

public class PopcornChicken implements IkfcBrand{
    @Override
    public void provideFood() {
        System.out.println("PopcornChicken is cooked and provided");
    }
}
