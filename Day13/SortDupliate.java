import java.util.*;

public class SortDupliate {

    public static void main(String[] args) {
        // to remove the duplicate elements without using extra space in an sorted array
        int[] arr = { 1, 1, 2, 2, 3 };
        int n = arr.length;
        int i = 0;
        int j = 1;
        int res = 1;
        while (j < n) {
            if (arr[j] == arr[j - 1]) {
                j++;
                continue;
            } else {
                arr[i + 1] = arr[j];
                i++;
                j++;
                res++;
            }

        }
        for (int k = 0; k < res; k++) {
            System.out.print(arr[k] + " ");
        }

    }
}
