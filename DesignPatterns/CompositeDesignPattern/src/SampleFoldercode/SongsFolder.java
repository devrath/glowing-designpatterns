package SampleFoldercode;

public class SongsFolder implements Component {

    @Override
    public void printFolderDetails() {
        printFolderSize();
        printNoOfItems();
    }

    public void printFolderSize() {
        System.out.println("Size of the Songs folder is X-Bytes");
    }

    public void printNoOfItems() {
        System.out.println("The number of items in Songs folder are X-Items");
    }

}
