import java.util.*;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int a =0,b=1;
        for(int i=1; i<=no; i++){
            System.out.print(a+" ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
}