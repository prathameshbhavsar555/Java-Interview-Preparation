import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int sum=0;
        for(int i=0; i<no; i++){
            if(i%2==0){
                sum +=i;
            }
        }
         System.out.println(no>0 && no==sum ?"Perfect":"Not Perfect");
    }
}
