import java.util.Scanner;

public class LargeOfTwoOrThree {
    public static void main(String x[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b){
            System.out.println(a+ " This is Largest");
        }else if(b >a){
            System.out.println(b+" This is largest");
        }else{
            System.out.println("Both Number Are Equal");
        }
    }
}
