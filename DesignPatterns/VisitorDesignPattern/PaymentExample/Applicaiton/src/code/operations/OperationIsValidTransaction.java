package code.operations;

import code.paymentModes.PaymentGooglePay;
import code.paymentModes.PaymentPhonePe;

/**
 * All the logic of an operation in one place
 */
public class OperationIsValidTransaction implements Visitor {
    @Override
    public void visit(PaymentGooglePay googlePay) {
        System.out.println("Implementation - checking google pay transaction is valid ot not");
    }

    @Override
    public void visit(PaymentPhonePe paymentPhonePe) {
        System.out.println("Implementation - checking phone pay transaction is valid ot not");
    }
}
