public class Main {
    public static void main(String[] args) {

        System.out.println("Starting the Program");
        Feature feat = new Feature();
        feat.add(new ConcreteElementA());
        //feat.add(new ConcreteElementB());

        feat.execute(new OperationA());
        System.out.println("Ending the Program");

    }
}