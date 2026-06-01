import java.util.*;
public class ArraysTask {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        int avg=sum/n;
        System.out.println("max: "+max);
        System.out.println("min: "+min);
        System.out.println("avg: "+avg);
    }
}
