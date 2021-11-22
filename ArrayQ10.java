import java.util.ArrayList;
import java.util.Scanner;

public class ArrayQ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        getArray(arr, sc, n);
        int jumps = minJumps(arr, n);
        System.out.println("out of min jumps");
        System.out.println(jumps);
    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n) {
        int num;
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static int minJumps(ArrayList<Integer> arr, int n) {
        int c = 0;
        System.out.println("in min jumps");
        int i = 0;
        while (i < n - 1) {
            i = i + arr.get(i);
            c++;
            System.out.println("in loop");
        }
        return c;
    }
}
// 1 3 5 8 9 2 6 7 6 8 9
// 1 4 3 2 6 7