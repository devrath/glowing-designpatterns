package code;

public class MoviesFolder implements Component{

    @Override
    public void printFolderDetails() {
        printFolderSize();
        printNoOfItems();
    }

    private void printFolderSize() {
        System.out.println("Size of the Movies folder is X-Bytes");
    }

    private void printNoOfItems() {
        System.out.println("The number of items in Movies folder are X-Items");
    }
}
