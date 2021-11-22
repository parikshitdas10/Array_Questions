import java.util.*;

public class ArrayQ1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println("Your Array is " + arr);
        reverse(arr);
        System.out.println("After reversing " + arr);
    }

    static void reverse(ArrayList<Integer> arr) {
        int n = arr.size();
        int start = 0, end = n - 1; // pointers to start and end of array
        int temp;
        while (start < end) {
            temp = arr.get(start);// simple swap
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;// moving to the next elements
            end--;
        }
    }
}