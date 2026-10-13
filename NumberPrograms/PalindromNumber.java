import java.util.*;
public class PalindromNumber{
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int temp = no;
        int rev = 0;
        while (no!=0) {
            int r = no%10;
            rev = rev*10 +r;
            no = no/10;
        }
        System.out.println(temp==rev ?"Palindrom":"Not Palindrom");
    }
}                   