package code;

import code.feature.FeaturePayment;
import code.operations.OperationHasCardSaved;
import code.operations.OperationIsUserBlocked;
import code.operations.OperationIsValidTransaction;
import code.paymentModes.PaymentGooglePay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting the Program");
        // ------------------------------------------------------------
        FeaturePayment feat = new FeaturePayment();
        // Feature to be executed
        feat.add(new PaymentGooglePay());
        // Operations to be performed
        feat.execute(new OperationIsUserBlocked());
        feat.execute(new OperationIsValidTransaction());
        feat.execute(new OperationHasCardSaved());
        // ------------------------------------------------------------
        System.out.println("Ending the Program");

    }
}