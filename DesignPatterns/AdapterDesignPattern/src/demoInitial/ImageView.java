package demoInitial;

public class ImageView {

    private Image img;

    public ImageView(Image img){
        this.img = img;
    }

    /**
     * We pass filter interface, so it can be red filter or green filter
     * @param filter
     */
    public void applyFilter(Filter filter){
        filter.apply(img);
    }

}
