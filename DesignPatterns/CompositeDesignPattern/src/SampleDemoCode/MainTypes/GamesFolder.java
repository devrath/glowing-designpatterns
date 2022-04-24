package SampleDemoCode.MainTypes;

import SampleDemoCode.FolderDetailsComponent;

public class GamesFolder implements FolderDetailsComponent {
    @Override
    public void printFolderDetails() {
        System.out.println("Folder Details: Game's");
    }
}
