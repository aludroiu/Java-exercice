package Objects.classes;

/*public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product) {
        productType = product;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("lemonade");
        System.out.println(lemonadeStand.productType);
    }
}*/

public class Store {
    // instance fields
    String productType;
    //new instance field
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store cookieShop = new Store("cookies", 12, 3.75);
    }
}