import java.util.Scanner;
import java.util.*;
class MaximumAndMinimumOfArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int ar[]=new int[a];    // array initializer
        for(int i=0;i<a;i++){
            ar[i]=sc.nextInt();
        } 
        //maximum and Minimum 
        int max=ar[0], min=ar[0];
        
        for(int i=0;i<a;i++){
            if(ar[i]> max){
                max= ar[i];
            }

            if(ar[i]< min){
                min =ar[i];
            }
        } 
            System.out.println(max);
            System.out.println(min);
        
    }
}