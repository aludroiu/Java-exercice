package Methods.java;

/*public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money!");
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        lemonadeStand.advertise();
        lemonadeStand.advertise();
        lemonadeStand.advertise();
    }
}
 */

public class Store {
    // instance fields
    String productType;

    public void greetCustomer(String customer){
        System.out.println("Welcome to the store, " + customer + "!");
    }

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // advertise method
    public void advertise() {
        String message = "Selling " + productType + "!";
        System.out.println(message);
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade");
        lemonadeStand.greetCustomer("Laura");
    }
}