package Module;

import Image.FilterImageView;
import Service.FilterService;

public class FilterModule implements FilterService {

    public FilterModule() {
    }

    @Override
    public void apply(FilterImageView image) {
        System.out.println("Filter module invoked");
        System.out.println("IMAGE STATUS ----------------> "+image.getImageLocation());
    }
}
