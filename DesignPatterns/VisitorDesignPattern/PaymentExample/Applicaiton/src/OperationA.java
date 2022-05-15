/**
 * All the logic of an operation in one place
 */
public class OperationA implements Visitor{
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("HI");
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("HI-1");
    }
}
