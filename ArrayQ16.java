import java.util.*;

public class ArrayQ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();

        getArray(arr, sc, n);

        System.out.println("Enter sum: ");
        int k = sc.nextInt();
        int c = getPairs(arr, n, k);
        System.out.println(c);

    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n) {
        int num;
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static int getPairs(ArrayList<Integer> arr, int n, int k) {
        int c = 0;
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (arr.get(i) + arr.get(j) == k) {
                    c++;
                }
            }
        }
        return c;
    }
}
