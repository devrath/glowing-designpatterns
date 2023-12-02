package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        MaterialAlert alert = new MaterialAlert.Builder("Yes","No").build();
    }
}