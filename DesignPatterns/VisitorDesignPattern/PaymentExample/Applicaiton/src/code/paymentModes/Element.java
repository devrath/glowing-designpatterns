package code.paymentModes;

import code.operations.Visitor;

public interface Element {
    public void accept(Visitor visitor);
}
