public class PaymentModeGooglePay implements PaymentOptions{

    @Override
    public void validatePaymentParams() {
        System.out.println("PaymentModeGooglePay - validatePayment");
    }

    @Override
    public void initiatePayment() {
        System.out.println("PaymentModeGooglePay - initiatePayment");
    }

}
