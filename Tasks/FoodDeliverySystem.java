abstract class FoodService {
    String itemName;
    int count;
    double cost;

    public void FoodServicee() {
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

class PizzaOrder extends FoodService {
    PizzaOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Pizza order confirmed.");
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

class DosaOrder extends FoodService {
    DosaOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Dosa order confirmed.");
    }
}

class BiryaniOrder extends FoodService {
    BiryaniOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Biryani order confirmed.");
    }
}

class SandwichOrder extends FoodService {
    SandwichOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Sandwich order confirmed.");
    }
}

class NoodlesOrder extends FoodService {
    NoodlesOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Noodles order confirmed.");
    }
}

class PastaOrder extends FoodService {
    PastaOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Pasta order confirmed.");
    }
}

class IceCreamOrder extends FoodService {
    IceCreamOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Ice Cream order confirmed.");
    }
}

class JuiceOrder extends FoodService {
    JuiceOrder(String itemName, int count, double cost) {
        super(itemName, count, cost);
    }
    @Override
    void placeOrder() {
        System.out.println("Juice order confirmed.");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        
        BurgerOrder b = new BurgerOrder("Cheese Burger", 2, 120);
        PizzaOrder p = new PizzaOrder("Veg Pizza", 1, 250);
        IdliOrder i = new IdliOrder("Idli", 4, 30);
        DosaOrder d = new DosaOrder("Masala Dosa", 2, 80);
        BiryaniOrder br = new BiryaniOrder("Chicken Biryani", 1, 220);
        SandwichOrder s = new SandwichOrder("Veggie Sandwich", 1, 100);
        NoodlesOrder n = new NoodlesOrder("Hakka Noodles", 1, 120);
        PastaOrder pa = new PastaOrder("Alfredo Pasta", 1, 150);
        JuiceOrder j = new JuiceOrder("Orange Juice", 2, 50);
        IceCreamOrder ic = new IceCreamOrder("Vanilla Ice Cream", 2, 60);
        
        b.placeOrder();
        b.printBill();
        
        p.placeOrder();
        p.printBill();
        
        i.placeOrder();
        i.printBill();
        
        d.placeOrder();
        d.printBill();
        
        br.placeOrder();
        br.printBill();
        
        s.placeOrder();
        s.printBill();
        
        n.placeOrder();
        n.printBill();
        
        pa.placeOrder();
        pa.printBill();

        j.placeOrder();
        j.printBill();
        
        ic.placeOrder();
        ic.printBill();
    }
}