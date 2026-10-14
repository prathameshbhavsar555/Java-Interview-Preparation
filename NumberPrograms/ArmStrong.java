import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int temp = no;
        int result=0;
        while (no!=0) {
            int r = no%10;
            result += r*r*r ;
            no/=10;
        }
        System.out.println(temp==result ? "ArmStrong":"Not ArmStrong");
    }
}
