import java.util.*;

public class ArrayQ17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();
        System.out.println("Enter size of three arrays");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        int c = 1;
        getArray(arr2, sc, m, c);
        c++;
        getArray(arr1, sc, n, c);
        c++;
        getArray(arr3, sc, o, c);
        printDupli(arr1, arr2, arr3, m, n, o);

    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n, int c) {
        int num;
        System.out.println("Enter elements of array" + c);
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static void printDupli(ArrayList<Integer> arr1, ArrayList<Integer> arr2, ArrayList<Integer> arr3, int m, int n,
            int o) {
        int i = 0;
        int j = 0;
        int k = 0;
        // assume i is pointing at x, j at y and k at z.
        while (true) {
            if (arr1.get(i) == arr2.get(j) && arr2.get(j) == arr3.get(k)) {
                System.out.print(arr1.get(i) + ", ");
                if (i < m)
                    i++;
                if (j < n)
                    j++;
                if (k < o)
                    k++;
            }
            // if x<y
            else if (arr1.get(i) < arr2.get(j)) {
                if (i < m) {
                    i++;
                }
            }
            // if y<z
            else if (arr2.get(j) < arr3.get(k)) {
                if (j < n) {
                    j++;
                }
            }
            // if z is smallest;
            else {
                if (k < o) {
                    k++;
                }
            }
            if ((i >= m - 1) && (j >= n - 1))
                if (k >= o - 1)
                    break;

        }
    }
}
// 1 5 10 20 40 80
// 6 7 20 80 100
// 3 4 15 20 30 70 80 120
