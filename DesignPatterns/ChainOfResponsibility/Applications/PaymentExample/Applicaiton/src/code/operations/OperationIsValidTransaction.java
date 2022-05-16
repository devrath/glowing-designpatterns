package code.operations;

import code.paymentModes.PaymentGooglePay;
import code.paymentModes.PaymentPhonePe;

/**
 * All the logic of an operation in one place
 */
public class OperationIsValidTransaction implements Visitor {
    @Override
    public Boolean visit(PaymentGooglePay googlePay) {
        System.out.println("Implementation - checking google pay transaction is valid ot not");
        return true;
    }

    @Override
    public Boolean visit(PaymentPhonePe paymentPhonePe) {
        System.out.println("Implementation - checking phone pay transaction is valid ot not");
        return true;
    }
}
