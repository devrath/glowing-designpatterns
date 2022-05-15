package code.feature;

import code.paymentModes.Element;
import code.operations.Visitor;

import java.util.ArrayList;
import java.util.List;

public class FeaturePayment {
    // This will store the list of operations to be performed
    private List<Element> operations = new ArrayList<>();

    // Adding the operation to the list of operations
    public void add(Element element) {
        operations.add(element);
    }

    // Initiating the list of operations one after other
    public void execute(Visitor visitor){
        for (Element element : operations) {
            element.accept(visitor);
        }
    }
}
