import Module.FileDoc;
import Module.Presentation;
import Module.builders.PdfFileBuilder;

public class Main {

    public static void main(String[] args){


        Presentation pres = new Presentation();
        pres.addFile(new FileDoc("Content-1"));
        pres.addFile(new FileDoc("Content-2"));


        pres.export(new PdfFileBuilder());
    }

}
