import Filters.FilterColorBlackAndWhite;
import Filters.FilterColorGreen;
import Filters.FilterColorRed;
import Image.FilterImageView;
import Module.FilterModule;
import Service.FilterService;

public class Main {
    public static FilterImageView FilterImageView = new FilterImageView("/SD-Card");

    public static void main(String[] args){
        // Initiate the functionality
        applyFilterForImage(new FilterColorBlackAndWhite(new FilterColorRed(new FilterColorGreen(new FilterModule()))));
    }

    private static void applyFilterForImage(FilterService filterService) {
        filterService.apply(FilterImageView);
    }

}
