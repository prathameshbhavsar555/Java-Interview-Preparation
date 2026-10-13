import java.util.*;
public class SwapTwoNumber{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Using Third Variable :- >
        // int temp =a;             
        // a = b;
        // b = temp;
        //Without Using Third Variable :->
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping");
        System.out.println("a : "+ a);
        System.out.println("b : "+b);

        
    }
}