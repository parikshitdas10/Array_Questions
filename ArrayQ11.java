import java.util.*;

public class ArrayQ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        getArray(arr, sc, n);
        Collections.sort(arr);
        int k = getDuplicate(arr, n);
        System.out.println(k);

    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n) {
        int num;
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static int getDuplicate(ArrayList<Integer> arr, int n) {
        int i;
        for (i = 1; i < n; i++) {
            if (arr.get(i) == arr.get(i - 1)) {
                break;
            }
        }
        return arr.get(i);
    }
}
