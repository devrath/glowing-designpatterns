package code;

import java.util.ArrayList;
import java.util.List;

public class CategoryGroups {

    private List<Object> shapes = new ArrayList<>();

    public void add(Object object){
        shapes.add(object);
    }

    public void printFolderDetails() {
        for (Object obj: shapes) {
            if (obj instanceof MoviesFolder){
                System.out.println("----------------------------");
                ((MoviesFolder)obj).printFolderDetails();
                System.out.println("----------------------------");
            } else if(obj instanceof SoftwaresFolder) {
                System.out.println("----------------------------");
                ((SoftwaresFolder)obj).printFolderDetails();
                System.out.println("----------------------------");
            } else if(obj instanceof SongsFolder) {
                System.out.println("----------------------------");
                ((SongsFolder)obj).printFolderDetails();
                System.out.println("----------------------------");
            }
        }
    }

}
