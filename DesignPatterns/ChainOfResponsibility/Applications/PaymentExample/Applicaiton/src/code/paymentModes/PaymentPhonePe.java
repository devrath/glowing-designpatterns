package code.paymentModes;

import code.operations.Visitor;

public class PaymentPhonePe implements Element {
    @Override
    public Boolean accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
