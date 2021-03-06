package SampleFoldercode;

public class SoftwaresFolder implements Component {

    @Override
    public void printFolderDetails() {
        printFolderSize();
        printNoOfItems();
    }

    public void printFolderSize() {
        System.out.println("Size of the Software folder is X-Bytes");
    }

    public void printNoOfItems() {
        System.out.println("The number of items in Software folder are X-Items");
    }
}
