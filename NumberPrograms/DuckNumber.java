import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        boolean isDuck = false;
        while (no!=0) {
            int r = no%10;
            if(r==0){
                isDuck = true;
                break;
            }
            no /=10;
        }
        if (isDuck) {
            System.out.println("Duck Number");
        }else{
            System.out.println("Not a Duck Number");
        }
    }
}
