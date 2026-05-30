class Employees{
    String name;
    int salary;
    Employees(String name, int salary){
        this.name=name;
        this.salary=salary;
    }
    void displaydetails(){
        System.out.println("Employee name: "+name);
        System.out.println("Employee salary: "+salary);
    }
}
class Developer extends Employees{
    Developer(String name, int salary){
        super(name, salary);
    }
}
class Tester extends Employees{
    Tester(String name, int salary){
        super(name, salary);
    }
}
class Devops extends Employees{
    Devops(String name, int salary){
        super(name, salary);
    }
}
public class inheritexp{
    public static void main(String args[]){
        Developer d=new Developer("Pradeep", 30000);
        Tester t=new Tester("Rupee",35000);
        Devops dev=new Devops("Revanth", 25000);
        d.displaydetails();
        t.displaydetails();
        dev.displaydetails();
    }
}