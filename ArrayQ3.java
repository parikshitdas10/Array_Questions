import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class ArrayQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int num;
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }
        System.out.println("Enter k");
        int k = sc.nextInt();

        System.out.println("The " + k + "th smallest element is " + kthSmallest(arr, k));
    }

    static int kthSmallest(ArrayList<Integer> arr, int k) {
        Collections.sort(arr); // sorting the array
        return arr.get(k - 1);
    }
}
