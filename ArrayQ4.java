import java.util.ArrayList;
import java.util.Scanner;

public class ArrayQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        getArray(arr, sc);
        dnfSort(arr);
        printArray(arr);

    }

    static void getArray(ArrayList<Integer> arr, Scanner sc) {
        int temp;
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            arr.add(temp);
        }
    }

    static void dnfSort(ArrayList<Integer> arr) {
        int low = 0, mid = 0;
        int high = arr.size() - 1;
        int temp;
        while (mid != high) {
            if (arr.get(mid) == 0) {
                temp = arr.get(mid);// swapping
                arr.set(mid, arr.get(low));
                arr.set(low, temp);
                low++;
                mid++;
            } else if (arr.get(mid) == 1) {
                mid++;
            } else if (arr.get(mid) == 2) {
                temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

    static void printArray(ArrayList<Integer> arr) {
        System.out.println(arr);
    }
}
