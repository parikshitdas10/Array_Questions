import java.util.*;

public class ArrayQ18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        getArray(arr, sc, n);
        int sPos = partition(arr, n);// stores the starting position of positive elements
        System.out.println(sPos);
        arrange(arr, n, sPos);
        System.out.println(arr);
    }

    static void getArray(ArrayList<Integer> arr, Scanner sc, int n) {
        int num;
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            arr.add(num);
        }

    }

    static int partition(ArrayList<Integer> arr, int n) {
        int pos = 0;
        int neg = 0;
        int temp;
        int i = 0;

        while (i < n) {
            if (arr.get(pos) < 0 && arr.get(neg) > 0) {
                temp = arr.get(pos);
                arr.set(pos, arr.get(neg));
                arr.set(neg, temp);
            }
            if (arr.get(pos) > 0) {
                if (pos < n - 1)
                    pos++;
            }
            if (arr.get(neg) < 0) {
                if (neg < n - 1)
                    neg++;
            }
            i++;
        }
        return neg;// returns starting position of positive numbers
    }

    static void arrange(ArrayList<Integer> arr, int n, int sPos) {
        int sNeg = 0;// negative numbers are starting from 0th index;
        int temp;
        while (sPos > sNeg && sPos < n) {
            temp = arr.get(sNeg);// swap
            arr.set(sNeg, arr.get(sPos));
            arr.set(sPos, temp);
            sNeg = sNeg + 2;
            sPos++;
        }
    }
}
