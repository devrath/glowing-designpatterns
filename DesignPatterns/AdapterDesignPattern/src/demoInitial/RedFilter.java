package demoInitial;

import java.awt.*;

public class RedFilter implements Filter{

    @Override
    public void apply(Image image) {
        System.out.println("Applying the red filter for image: "+image);
    }

}
