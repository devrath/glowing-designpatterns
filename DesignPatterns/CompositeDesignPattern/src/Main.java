import code.CategoryGroups;
import code.MoviesFolder;
import code.SoftwaresFolder;
import code.SongsFolder;

public class Main {
    public static void main(String[] args){

        CategoryGroups categoryGroups = new CategoryGroups();
        categoryGroups.add(new SongsFolder());
        categoryGroups.add(new MoviesFolder());
        categoryGroups.add(new SoftwaresFolder());

        categoryGroups.add(new CategoryGroups());
        categoryGroups.printFolderDetails();

    }
}
