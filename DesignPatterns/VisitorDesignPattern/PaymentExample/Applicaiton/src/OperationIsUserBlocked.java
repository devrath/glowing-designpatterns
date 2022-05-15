public class OperationIsUserBlocked implements Visitor{
    @Override
    public void visit(PaymentGooglePay googlepay) {
        System.out.println("Implementation - checking google pay user is blocked or not");
    }

    @Override
    public void visit(PaymentPhonePe paymentPhonePe) {
        System.out.println("Implementation - checking phone pay user is blocked or not");
    }
}
