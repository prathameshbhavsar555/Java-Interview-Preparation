import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int square = no*no;
        int sum =0;
        while(square!=0){
            int r = square%10;
            sum +=r;
            square /=10;
        }
        System.out.println(no==sum?"Neon Number":"Not a Neon Number");
    }
}
