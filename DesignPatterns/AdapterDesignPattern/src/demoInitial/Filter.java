package demoInitial;

import java.awt.*;

/**
 * Responsibility: You supply image and apply filter for it.
 */
public interface Filter {
    void apply(Image image);
}
