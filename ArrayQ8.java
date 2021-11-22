import java.util.*;

public class ArrayQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        getArray(arr, sc);
        System.out.println(kadaneMaxSum(arr));
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

    static int kadaneMaxSum(ArrayList<Integer> arr) {
        // implementing Kadane's Algorithm.
        int n = arr.size();
        int maxSum = arr.get(0);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr.get(i);
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
