import java.util.*;

public class ArrayQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter size of first array: ");
        int n = sc.nextInt();
        getArray(arr1, sc, n);
        System.out.println("Enter size of second array: ");
        int m = sc.nextInt();
        getArray(arr2, sc, m);
        merge(arr1, arr2, n, m);
        printMerged(arr1, arr2, n, m);
    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n) {
        int num;
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static void merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        int temp;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr2.get(i) < arr1.get(j)) {
                    temp = arr2.get(i);
                    arr2.set(i, arr1.get(j));
                    arr1.set(j, temp);
                }
            }
        }
        Collections.sort(arr2);
    }

    static void printMerged(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m) {
        int i;
        System.out.print("[");
        for (i = 0; i < n; i++) {
            System.out.print(arr1.get(i) + " ");
        }
        for (i = 0; i < m; i++) {
            System.out.print(arr2.get(i) + " ");
        }
        System.out.print("]");
    }
}
