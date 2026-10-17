import java.util.Scanner;

public class SecoundSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();

        int a[] = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int small = Integer.MAX_VALUE;
        int secound = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < small) {
                secound = small;
                small = a[i];
            } else if (a[i] > small && a[i] < secound) {
                secound = a[i];
            }
        }

        System.out.println("Smallest: " + small);

        if (secound == Integer.MAX_VALUE) {
            System.out.println("Second smallest element does not exist");
        } else {
            System.out.println("Second smallest: " + secound);
        }
    }
}
