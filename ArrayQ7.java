import java.util.*;

public class ArrayQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        getArray(arr, sc);
        cycRotate(arr);
        printArray(arr);

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

    static void cycRotate(ArrayList<Integer> arr) {
        int n = arr.size();
        int temp = arr.get(n - 1);// storing the last element
        int i = n - 2; // pointing to second last element
        int j = n - 1;// pointing to last element
        while (i >= 0) {
            arr.set(j, arr.get(i));// shifting elements to the left by one
            i--;
            j--;
        }
        arr.set(0, temp);// moving the last element to the first position
    }

    static void printArray(ArrayList<Integer> arr) {
        System.out.println(arr);
    }
}
