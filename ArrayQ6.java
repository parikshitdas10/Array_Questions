import java.util.ArrayList;
import java.util.Scanner;

public class ArrayQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int i;
        int c = 0;
        int temp;
        System.out.println("Enter number of elements in 1st Array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (i = 0; i < n; i++) {
            temp = sc.nextInt();
            arr.add(temp);
        }
        System.out.println("Enter the number of elements in 2nd Array: ");
        int m = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (i = 0; i < m; i++) {
            temp = sc.nextInt();
            arr2.add(temp);
            for (int j = 0; j < n; j++) {
                if (temp == arr.get(j)) {
                    c++;// c stores the count of repeated elements
                }
            }

        }
        int union = n + (m - c);
        System.out.println(union);// union
        System.out.println(c);// intersection
    }
}
