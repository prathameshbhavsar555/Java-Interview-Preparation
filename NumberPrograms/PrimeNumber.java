import java.util.*;
public class PrimeNumber {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int count =0;
        for(int i=1; i<=no; i++){
            if(no%i==0){
                count ++;
            }
        }
        System.out.println(count==2?"Prime":"Not Prime");
    }
}
