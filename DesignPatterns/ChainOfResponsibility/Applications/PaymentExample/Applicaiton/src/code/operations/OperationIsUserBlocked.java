package code.operations;

import code.paymentModes.PaymentGooglePay;
import code.paymentModes.PaymentPhonePe;

public class OperationIsUserBlocked implements Visitor {
    @Override
    public Boolean visit(PaymentGooglePay googlepay) {
        System.out.println("Implementation - checking google pay user is blocked or not");
        return false;
    }

    @Override
    public Boolean visit(PaymentPhonePe paymentPhonePe) {
        System.out.println("Implementation - checking phone pay user is blocked or not");
        return true;
    }
}
