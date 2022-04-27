package Filters;

import Image.FilterImageView;
import Service.FilterService;

public class FilterColorGreen implements FilterService {

    private FilterService service;

    public FilterColorGreen(FilterService service) {
        this.service = service;
    }

    @Override
    public void apply(FilterImageView image) {
        service.apply(image);
        System.out.println("Green filter applied");
        image.setImageLocation(image.getImageLocation()+"-"+"Green");
        System.out.println("IMAGE STATUS ----------------> "+image.getImageLocation());    }
}
