package Module;

import Module.builders.PresentationBuilder;

import java.util.ArrayList;
import java.util.List;

public class Presentation {

    private List<FileDoc> files = new ArrayList<>();

    public void addFile(FileDoc fileDoc) {
        files.add(fileDoc);
    }

    public void export (PresentationBuilder builder) {
        for (FileDoc fileDoc:files) {
            builder.addFile(fileDoc);
        }
    }


}
