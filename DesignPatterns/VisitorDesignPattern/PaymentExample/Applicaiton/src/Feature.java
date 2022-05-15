import java.util.ArrayList;
import java.util.List;

public class Feature {
    private List<Element> operations = new ArrayList<>();

    public void add(Element element) {
        operations.add(element);
    }

    public void execute(Visitor visitor){
        for (Element element : operations) {
            element.accept(visitor);
        }
    }
}
