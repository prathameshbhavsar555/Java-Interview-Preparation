import java.util.Scanner;

public class SortingArrayAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i =0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Ascending Sorder Order of Element");
        for(int i=0 ; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }   
        }
        for(int element : a){
            System.out.println(element +" ");
        }
    }
}
