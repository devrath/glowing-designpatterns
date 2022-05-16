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
        boolean resultIsBlocked = feat.execute(new OperationIsUserBlocked());
        boolean resultIsValidTransaction = feat.execute(new OperationIsValidTransaction());
        boolean resultHasCardSaved = feat.execute(new OperationHasCardSaved());

        if (resultIsBlocked && resultIsValidTransaction && resultHasCardSaved) {
            System.out.println("Operation successful");
        } else {
            System.out.println("Operation un-successful");
        }
        // ------------------------------------------------------------
        System.out.println("Ending the Program");

    }
}