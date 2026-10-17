import java.util.Scanner;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int n = a.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
