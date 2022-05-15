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
    public boolean execute(Visitor visitor){
        boolean areOperationsSuccessful = true;
        for (Element element : operations) {
            areOperationsSuccessful = element.accept(visitor);
            if(areOperationsSuccessful==false){
                break;
            }
        }
        return areOperationsSuccessful;
    }
}
