class Bankaccount {
    String name;
    int id;
    double amount;
    Bankaccount(String name, int id, double amount) {
        this.name = name;
        this.id = id;
        this.amount = amount;
    }
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Amount : " + amount);
    }
}
class Customer extends Bankaccount {
    Customer(String name, int id, double amount) {
        super(name, id, amount);
    }
    void deposit(double depositamount) {
        amount += depositamount;
        System.out.println("Deposited Amount : " + depositamount);
    }
    void withdraw(double withdrawamount) {
        if (withdrawamount <= amount) {
            amount -= withdrawamount;
            System.out.println("Withdrawn Amount : " + withdrawamount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
public class inheritance {
    public static void main(String[] args) {
        Customer c = new Customer("Pradeep", 101, 5000);
        System.out.println("Account Details:");
        c.display();
        c.deposit(2000);
        c.withdraw(1000);
        System.out.println("\nUpdated Account Details:");
        c.display();
    }
}