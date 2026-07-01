import java.util.*;

public class SquaresortArray {
    public static void main(String[] args) {
        int arr[] = { -4, -1, 0, 3, 10 };
        int n = arr.length;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) { // positives
                b.add(arr[i]);
            } else {
                a.add(arr[i]);
            }
        }
        // all are positives
        for (int j = 0; j < a.size(); j++) {
            int val = a.get(j);
            a.set(j, val * val);

        }

        for (int i = 0; i < b.size(); i++) {
            int val = b.get(i);
            b.set(i, val * val);
        }

        List<Integer> res = new ArrayList<>();
        res.addAll(a);
        res.addAll(b);
        Collections.sort(res);
        System.out.println(res);
    }
}
