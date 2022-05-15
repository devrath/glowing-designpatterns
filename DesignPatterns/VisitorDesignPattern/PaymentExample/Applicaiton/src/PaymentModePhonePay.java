public class PaymentModePhonePay implements PaymentOptions{

    @Override
    public void validatePaymentParams() {
        System.out.println("PaymentModePhonePay - validatePayment");
    }

    @Override
    public void initiatePayment() {
        System.out.println("PaymentModePhonePay - initiatePayment");
    }

}
