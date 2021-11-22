import java.util.*;

public class ArrayQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        getArray(arr, sc);
        negSort(arr);
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

    static void negSort(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        int temp;
        while (low < high) {
            if (arr.get(low) < 0) {
                low++;
            }
            if (arr.get(high) > 0) {
                high--;
            }
            if (arr.get(low) > 0) {
                temp = arr.get(low);
                arr.set(low, arr.get(high));
                arr.set(high, temp);
                high--;
            }
        }
    }

    static void printArray(ArrayList<Integer> arr) {
        System.out.println(arr);
    }
}
