import java.util.Scanner;

public class CheckPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        if(no > 0){
            System.out.println("Number is Positive");
        }else if(no < 0){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
