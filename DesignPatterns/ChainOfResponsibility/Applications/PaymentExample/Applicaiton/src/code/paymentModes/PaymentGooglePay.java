package code.paymentModes;

import code.operations.Visitor;

public class PaymentGooglePay implements Element {
    @Override
    public Boolean accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
