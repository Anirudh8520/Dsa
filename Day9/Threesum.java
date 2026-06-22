package Day9;
import java.util.*;
public class Threesum {
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int n = arr.length;
        HashSet<List<Integer>> res = new HashSet<>();
        for(int i=0; i<n; i++) {
            if(i>0 && arr[i]==arr[i-1]) {
                continue;
            }
            HashSet<Integer> seen = new HashSet<>();
            for(int j=i+1; j<n; j++) {
                int k = -arr[i]-arr[j];
                if(seen.contains(k)) {
                    res.add(Arrays.asList(arr[i],k,arr[j]));
                }
                seen.add(arr[j]);

            }
        }
        System.out.println("The values are:"+Arrays.asList(res));
    }
}
