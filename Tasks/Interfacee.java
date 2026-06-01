interface UPIPayments{
    void upi();
}

interface CashPayments{
    void cash();
}

class Payments implements UPIPayments, CashPayments{
    public void upi(){
        System.out.println("Payment through upi has done successfully!!");
    }
    public void cash(){
        System.out.println("Payment through cash has done successfully!!");
    }
}

public class Interfacee{
    public static void main(String args[]){
        Payments pay=new Payments();
        pay.upi();
        pay.cash();
    }
}