package Filters;

import Image.FilterImageView;
import Service.FilterService;

public class FilterColorBlackAndWhite implements FilterService {

    private FilterService service;

    public FilterColorBlackAndWhite(FilterService service) {
        this.service = service;
    }

    @Override
    public void apply(FilterImageView image) {
        service.apply(image);
        System.out.println("Black and white filter applied");
        image.setImageLocation(image.getImageLocation()+"-"+"BlackAndWhite");
        System.out.println("IMAGE STATUS ----------------> "+image.getImageLocation());
    }
}
