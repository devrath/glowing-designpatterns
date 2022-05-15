public class Main {
    public static void main(String[] args) {

        System.out.println("Starting the Program");
        Feature feat = new Feature();
        feat.add(new PaymentGooglePay());
        //feat.add(new ConcreteElementB());

        feat.execute(new OperationIsValidTransaction());
        System.out.println("Ending the Program");

    }
}