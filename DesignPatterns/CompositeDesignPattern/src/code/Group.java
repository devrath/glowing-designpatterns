package code;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Object> shapes = new ArrayList<>();

    public void add(Object object){
        shapes.add(object);
    }

    public void printFolderDetails() {
        for (Object obj: shapes) {
            if (obj instanceof MoviesFolder){
                System.out.println("----------------------------");
                ((MoviesFolder)obj).printFolderSize();
                ((MoviesFolder)obj).printNoOfItems();
                System.out.println("----------------------------");
            } else if(obj instanceof SoftwaresFolder) {
                System.out.println("----------------------------");
                ((SoftwaresFolder)obj).printFolderSize();
                ((SoftwaresFolder)obj).printNoOfItems();
                System.out.println("----------------------------");
            } else if(obj instanceof SongsFolder) {
                System.out.println("----------------------------");
                ((SongsFolder)obj).printFolderSize();
                ((SongsFolder)obj).printNoOfItems();
                System.out.println("----------------------------");
            }
        }
    }

}
