package Image;

public class FilterImageView {

    private String imageLocation;

    public FilterImageView(String imageLocation) {
        this.imageLocation = imageLocation;
        initializeImage();
    }

    /**
     * Check if the image is initialized or not
     */
    private void initializeImage() {
        if(imageLocation.length()==0) {
            System.out.println("Image is not initialized");
        }else{
            System.out.println("Image is initialized");
        }
    }

    /**
     * Get the image where it is needed
     * @return
     */
    public String getImageLocation() {
        return imageLocation;
    }

    /**
     * Setting the image after the filter is applied
     * @return
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

}
