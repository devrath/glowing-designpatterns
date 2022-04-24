package SampleDemoCode.MainTypes;

import SampleDemoCode.FolderDetailsComponent;

import java.util.ArrayList;

public class MoviesFolder implements FolderDetailsComponent {

    private ArrayList<FolderDetailsComponent> comp = new ArrayList<>();

    public void addItems(FolderDetailsComponent component) {
        comp.add(component);
    }

    @Override
    public void printFolderDetails() {

        System.out.println("Folder Details: Movie's");

        for(FolderDetailsComponent component : comp){
            component.printFolderDetails();
        }
    }
}
