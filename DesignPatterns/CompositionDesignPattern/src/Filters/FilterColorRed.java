package Filters;

import Image.FilterImageView;
import Service.FilterService;

public class FilterColorRed implements FilterService {

    private FilterService service;

    public FilterColorRed(FilterService service) {
        this.service = service;
    }

    @Override
    public void apply(FilterImageView image) {
        service.apply(image);
        System.out.println("Red filter applied");
        image.setImageLocation(image.getImageLocation()+"-"+"Red");
        System.out.println("IMAGE STATUS ----------------> "+image.getImageLocation());
    }
}
