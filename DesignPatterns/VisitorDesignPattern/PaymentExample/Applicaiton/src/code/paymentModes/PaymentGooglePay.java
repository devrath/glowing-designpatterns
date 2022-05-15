package code.paymentModes;

import code.operations.Visitor;

public class PaymentGooglePay implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
