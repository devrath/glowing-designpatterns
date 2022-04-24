package code;

import java.util.ArrayList;
import java.util.List;

public class CategoryGroups implements Component {

    private List<Component> shapes = new ArrayList<>();

    public void add(Component object){
        shapes.add(object);
    }

    @Override
    public void printFolderDetails() {
        for (Component obj: shapes) {
            System.out.println("----------------------------");
            obj.printFolderDetails();
            System.out.println("----------------------------");
        }
    }

}
