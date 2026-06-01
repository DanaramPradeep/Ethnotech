class Polymorphism{
    void Fair(){
        System.out.println("Here are the different fair details: ");
    }
}
class Car extends Polymorphism{
    int fair=250;
    @Override
    public void Fair(){
        super.Fair();
        System.out.println("The fair for Car is: "+fair);
    }
}
class Auto extends Polymorphism{
    int fair=180;
    @Override
    public void Fair(){
        System.out.println("The fair for Auto is: "+fair);
    }
}
class Bike extends Polymorphism{
    int fair=80;
    @Override
    public void Fair(){
        System.out.println("The fair for Bike is: "+fair);
    }
}
public class Uber{
    public static void main(String args[]){
        Car c=new Car();
        Auto a=new Auto();
        Bike b=new Bike();
        c.Fair();
        a.Fair();
        b.Fair();
        int min=c.fair;
        String vehicle="Car";
        if(a.fair<min){
            min=a.fair;
            vehicle="Auto";
        }
        if(b.fair<min){
            min=b.fair;
            vehicle="Bike";
        }
        System.out.println("Minimum Fair: "+min);
        System.out.println("Recommended vehicle: "+vehicle);
    }
}

