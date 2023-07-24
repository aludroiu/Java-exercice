package manipulating.variables;

public class MultAndDivide {
    public static void main(String[] args) {
        double subtotal = 30;
        double tax = 0.0875;
        double total = subtotal + subtotal * tax;

        System.out.println(total);
    }
}