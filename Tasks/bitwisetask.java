import java.util.Scanner;
class bitwisetask{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int units=sc.nextInt();
        if((units^250)==0){
            System.out.println("No need to pay bill");
        }
        else if(units>250){
            int bill=(units-250)*5;
            System.out.println("Pay bill");
            System.out.println("Billamount= "+bill);
        }
    }
}