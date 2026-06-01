import java.util.*;
public class factrecursion{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int fact=factorial(n);
        System.out.println("factorial of "+n+" is: "+fact);
    }
    
    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}