import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int temp = no;
        int sum =0;
        while(no!=0){
            int result = no%10;
            int fact = 1;
            for(int i=1; i<=result; i++){
                fact*=i;
            }
             sum += fact;
            no/=10;
        }
        System.out.println(temp>0 && temp==sum?"Strong Number":"Not Strong");
    }
}
