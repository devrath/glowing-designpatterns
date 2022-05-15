package code.operations;

import code.paymentModes.PaymentGooglePay;
import code.paymentModes.PaymentPhonePe;

/**
 * LOGIC 
 */
public class OperationHasCardSaved  implements Visitor {
    @Override
    public void visit(PaymentGooglePay googlepay) {
        System.out.println("Implementation - checking google pay user credentials is saved or not");
    }

    @Override
    public void visit(PaymentPhonePe paymentPhonePe) {
        System.out.println("Implementation - checking phone pay user credentials is saved or not");
    }
}
