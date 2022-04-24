package SampleDemoCode.MainTypes;

import SampleDemoCode.FolderDetailsComponent;

import java.util.ArrayList;

public class ParentFolder implements FolderDetailsComponent {

    ArrayList<FolderDetailsComponent> comp = new ArrayList<>();

    public void add(FolderDetailsComponent component){
        comp.add(component);
    }

    @Override
    public void printFolderDetails() {
        System.out.println("Folder Details: Parent Folder");
        for (FolderDetailsComponent component: comp) {
            component.printFolderDetails();
        }
    }

}
