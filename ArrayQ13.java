import java.util.ArrayList;

import java.util.*;

public class ArrayQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        getArray(arr, sc, n);
        nextPermutation(arr, n);
        printArray(arr);
    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n) {
        int num;
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static void nextPermutation(ArrayList<Integer> arr, int n) {
        System.out.println("in next per");
        int l = n - 1;
        int j, i;
        int temp;
        for (i = l; i > 0; i--) {
            System.out.println("in dec loop");
            if (arr.get(i) > arr.get(i - 1)) {
                System.out.println("detected irregularity");
                for (j = i; j <= l; j++) {
                    System.out.println("back tracking...");
                    if (arr.get(i - 1) >= arr.get(j)) {
                        System.out.println("found greater element, now swapping..");
                        temp = arr.get(j - 1);
                        arr.set(j - 1, arr.get(i - 1));
                        arr.set(i - 1, temp);
                        break;
                    }
                    if (j == l) {
                        temp = arr.get(i - 1);
                        arr.set(i - 1, arr.get(l));
                        arr.set(l, temp);
                        break;
                    }
                }
                break;
            }
        }

        reverse(arr, i, l);
    }

    static void reverse(ArrayList<Integer> arr, int i, int l) {
        System.out.println("something called reverse... with starting index " + i);
        int low = i;
        int high = l;
        int temp;
        while (low != high) {
            temp = arr.get(low);
            arr.set(low, arr.get(high));
            arr.set(high, temp);
            low++;
            high--;

        }
    }

    static void printArray(ArrayList<Integer> arr) {
        System.out.println(arr);
    }
}
