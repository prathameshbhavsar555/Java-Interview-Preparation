import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int no = sc.nextInt();
        int largest =0;
        int smallest =9;
        while (no!=0) {
            int r = no%10;
            if(r > largest){
                largest = r;
            }
            if(r < smallest){
                smallest = r;
            }
            no /=10;
        }
        System.out.println("Largest Digit : "+largest);
        System.out.println("Smallest Digit : "+smallest);
    }
}
