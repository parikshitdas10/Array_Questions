import java.util.*;

public class ArrayQ9 {
    static class Pair {
        int min;
        int max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        getArray(arr, sc);
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        maximiseMinimise(arr, k);
        Pair p = findMinMax(arr);
        getDiff(p);
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

    static void maximiseMinimise(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) - k < 0) {
                arr.set(i, arr.get(i) + k);
            } else {
                arr.set(i, arr.get(i) - k);
            }
        }
    }

    static Pair findMinMax(ArrayList<Integer> arr) {
        Pair p = new Pair();
        p.min = arr.get(0);
        p.max = arr.get(0);
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > p.max) {
                p.max = arr.get(i);
            }
            if (arr.get(i) < p.min) {
                p.min = arr.get(i);
            }
        }
        return p;
    }

    static void getDiff(Pair p) {
        int diff = p.max - p.min;
        System.out.println("The min diff is: " + diff);
    }
}
