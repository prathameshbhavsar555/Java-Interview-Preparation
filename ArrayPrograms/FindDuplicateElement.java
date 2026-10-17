import java.util.Scanner;

public class FindDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Duplicate Element");
        for(int i=0; i<a.length; i++){
            boolean found = false;
            for(int k=0; k<i; k++){
                if(a[i]==a[k]){
                    found = true; 
                    break;
                }
            }
            if (found) {
                continue;
            }
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
            }
        }

    }
}
