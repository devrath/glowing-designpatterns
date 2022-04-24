import code.Group;
import code.MoviesFolder;
import code.SoftwaresFolder;
import code.SongsFolder;

public class Main {
    public static void main(String[] args){

        Group group = new Group();
        group.add(new SongsFolder());
        group.add(new MoviesFolder());
        group.add(new SoftwaresFolder());

        group.printFolderDetails();

    }
}
