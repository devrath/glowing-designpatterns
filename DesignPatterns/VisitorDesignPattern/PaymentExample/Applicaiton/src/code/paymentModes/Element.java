package code.paymentModes;

import code.operations.Visitor;

public interface Element {
    Boolean accept(Visitor visitor);
}
