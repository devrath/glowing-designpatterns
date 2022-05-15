package code.paymentModes;

import code.operations.Visitor;

public class PaymentPhonePe implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
