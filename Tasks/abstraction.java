abstract class FoodService {
    String itemName;
    int count;
    double cost;
    public FoodService() {
        System.out.println("Welcome to Online Food Service");
    }
    public FoodService(String itemName, int count, double cost) {
        this.itemName = itemName;
        this.count = count;
        this.cost = cost;
    }
    abstract void placeOrder();
    void printBill() {
        double amount = count * cost;
        System.out.println("\nFood Item  : " + itemName);
        System.out.println("Quantity   : " + count);
        System.out.println("Unit Price : " + cost);
        System.out.println("Bill Amount: " + amount);
    }
}
class BurgerOrder extends FoodService {
    BurgerOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Burger order confirmed.");
    }
}
class IdliOrder extends FoodService {
    IdliOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Idli order confirmed.");
    }
}
public class abstraction {
    public static void main(String[] args) {
        BurgerOrder b = new BurgerOrder("Cheese Burger", 3, 120);
        IdliOrder i = new IdliOrder("Idli", 5, 30);
        b.placeOrder();
        b.printBill();
        i.placeOrder();
        i.printBill();
    }
}