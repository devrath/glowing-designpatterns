import SampleFoldercode.CategoryGroups;
import SampleFoldercode.MoviesFolder;
import SampleFoldercode.SoftwaresFolder;
import SampleFoldercode.SongsFolder;

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
