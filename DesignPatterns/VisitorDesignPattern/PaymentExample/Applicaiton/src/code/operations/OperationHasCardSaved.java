package code.operations;

import code.paymentModes.PaymentGooglePay;
import code.paymentModes.PaymentPhonePe;

/**
 * LOGIC
 */
public class OperationHasCardSaved  implements Visitor {
    @Override
    public Boolean visit(PaymentGooglePay googlepay) {
        System.out.println("Implementation - checking google pay user credentials is saved or not");
        return true;
    }

    @Override
    public Boolean visit(PaymentPhonePe paymentPhonePe) {
        System.out.println("Implementation - checking phone pay user credentials is saved or not");
        return true;
    }
}
