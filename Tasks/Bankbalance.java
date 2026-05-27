public class Bankbalance {
    private int balance;
    private String name;
    public void setId(int balance,String name){
        this.balance=balance;
        this.name=name;
    }
    public int getId(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public static void main(String args[]){
        Bankbalance bal=new Bankbalance();
        bal.setId(1000,"Pradeep");
        System.out.println("Name: "+bal.getName());
        System.out.println("Balance: "+bal.getId());
    }
}