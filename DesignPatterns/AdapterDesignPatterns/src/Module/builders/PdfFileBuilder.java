package Module.builders;

import Module.FileDoc;
import Module.exportTypes.FilePdf;

public class PdfFileBuilder implements PresentationBuilder{

    private FilePdf pdfFile = new FilePdf();

    @Override
    public void addFile(FileDoc fileDoc) {
        pdfFile.addFile(fileDoc.getContent());
    }

    public FilePdf getPdfDocFile() {
        return pdfFile;
    }

}
