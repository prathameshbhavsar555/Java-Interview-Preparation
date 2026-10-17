import java.util.*;
public class SecoundLargestElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int large = a[0];
        int secound = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] > large){
                large = a[i];
            }else if(a[i] > secound && a[i]<large){
                secound = a[i];
            }
        }
        System.out.println("Smallest :"+secound);
        
    }
}