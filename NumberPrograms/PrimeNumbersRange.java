import java.util.Scanner;

public class PrimeNumbersRange {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Starting Number");
        int start = sc.nextInt();
        System.out.println("Enter The Ending Number");
        int end = sc.nextInt();
        for(int i = start; i<=end; i++){
            boolean isprime = true;
            if(i <=1){
                isprime = false;
            }else{
                for(int j=2; j<=i/j ; j++){
                   if(i%j==0){
                     isprime = false;
                     break;
                   }
                }
            }
            if(isprime){
                System.out.print(i+" ");
            }
        }
    }
}
