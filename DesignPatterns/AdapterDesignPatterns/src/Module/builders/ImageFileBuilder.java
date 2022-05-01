package Module.builders;

import Module.FileDoc;
import Module.exportTypes.FileImage;

public class ImageFileBuilder implements PresentationBuilder{

    private FileImage fileImg = new FileImage();

    @Override
    public void addFile(FileDoc fileDoc) {
        fileImg.addFile(fileDoc.getContent());
    }

    public FileImage getFileImg() {
        return fileImg;
    }

}
