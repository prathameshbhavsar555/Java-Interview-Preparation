import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int sum=1;
        while (no!=0) {
            int r = no%10;
            sum *=r;
            no /=10;
        }
        System.out.println("Product of Digit :"+sum);
    }
}
