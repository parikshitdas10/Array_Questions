import java.util.*;

public class ArrayQ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        getArray(arr, sc, n);
        int c = countInversions(arr, n);
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

    static int countInversions(ArrayList<Integer> arr, int n) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) > arr.get(j)) {
                    c++;
                }
            }
        }
        return c;
    }
}