import java.util.*;
public class Jaggedarray {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int[][] arr=new int[3][];
        arr[0]=new int[2];
        arr[1]=new int[3];
        arr[2]=new int[4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            int total=0;
            for(int j=0;j<arr[i].length;j++){
                System.out.println("Student "+(i+1)+" marks in subject "+(j+1)+" is: "+arr[i][j]+" ");
                total+=arr[i][j];
            }
            System.out.println("Total marks of student "+(i+1)+" is: "+total);
            System.out.println(); 
        }
    }
}
