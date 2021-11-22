import java.util.*;

public class ArrayQ2 {
    // used this method to reduce time complexity,you may solve it without pair
    // class using seperate functions for min and max
    static class Pair {
        int min;
        int max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(19);
        arr.add(1);
        arr.add(204);
        arr.add(110);
        Pair ans = findMinMax(arr);
        System.out.println("The minimum element is " + ans.min + " The maximum element is " + ans.max);
    }

    static Pair findMinMax(ArrayList<Integer> arr) {
        Pair p = new Pair();// creating object
        p.max = arr.get(0);
        p.min = arr.get(0);
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            if (p.max < arr.get(i)) {// finding max
                p.max = arr.get(i);
            }
            if (p.min > arr.get(i)) {// finding min
                p.min = arr.get(i);
            }
        }
        return p;// returning object of class Pair

    }
}
