import java.util.*;
public class MinMIxElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Element");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] > max){ max =a[i];}
            if(a[i] < min){ min =a[i];}
        }
        System.out.println("largest Element :"+max);
        System.out.println("Smallest Element :"+min);
    }
}