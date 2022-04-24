package demoInitial;

public class GreenFilter implements Filter {

    @Override
    public void apply(Image image) {
        System.out.println("Applying the green filter for image: "+image);
    }

}
