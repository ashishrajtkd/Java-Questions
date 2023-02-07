import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int ar[]=new int[a];    // array initializer
        for(int i=0;i<a;i++){
            ar[i]=sc.nextInt();
        } 

        for(int i=a-1;i>=0;i--){
            System.out.println(ar[i]);
        }



    }
    
}
