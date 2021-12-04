import java.util.ArrayList;
import java.util.*;

public class ArrayQ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        getArray(arr, sc, n);
        int p = getProfit(arr, n);
        System.out.println(p);
    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n) {
        int num;
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static int getProfit(ArrayList<Integer> arr, int n) {
        int profit;
        int maxProfit = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) < arr.get(j)) {
                    profit = arr.get(j) - arr.get(i);
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
        }
        return maxProfit;
    }
}
