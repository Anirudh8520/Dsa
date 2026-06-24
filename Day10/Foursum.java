import java.util.*;
public class Foursum{
    public static void main(String[] args) {
        List<List<Integer>> res = new ArrayList<>();
        int arr[] = {2,2,2,2,2};
        Arrays.sort(arr);
        int target = 8;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            if(i>0 && arr[i] == arr[i-1]) {
                continue;
            }
            for(int j=i+1; j<n; ) { 
                int p = j+1,q=n-1;
                while(p < q) {
                    int sum = arr[i] + arr[j] + arr[p] + arr[q];
                    if( sum > target) {
                        q--;
                    } else if(sum < target) {
                        p++;
                    } else {
                        res.add(Arrays.asList(arr[i],arr[j],arr[p],arr[q]));
                        p++;
                        q--;
                        while(p<q && arr[p]==arr[p-1]) {
                            p++;
                        }
                    }
                }
                j++;
                while(j<n && arr[j]==arr[j-1]) {
                    j++;
                }
            }
        }
        System.out.println(res);
    }
}