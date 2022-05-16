package code.operations;

import code.paymentModes.PaymentGooglePay;
import code.paymentModes.PaymentPhonePe;

public interface Visitor {
    Boolean visit(PaymentGooglePay googlePay);
    Boolean visit(PaymentPhonePe paymentPhonePe);
}
