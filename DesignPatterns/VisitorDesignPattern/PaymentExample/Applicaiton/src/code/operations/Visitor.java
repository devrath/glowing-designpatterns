package code.operations;

import code.paymentModes.PaymentGooglePay;
import code.paymentModes.PaymentPhonePe;

public interface Visitor {
    public void visit(PaymentGooglePay googlepay);
    public void visit(PaymentPhonePe paymentPhonePe);
}
