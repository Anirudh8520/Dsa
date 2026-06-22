import java.util.*;
public class Twosumoptimised {
    public static void main (String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int arr[] = {9,2,11,15};
        int n = arr.length;
        int target = 11;
        
        //pairsum = start + end = target
        for(int i=0; i<n; i++ ) {
            int end = target-arr[i];
            if(map.containsKey(end)) {
                System.err.println("the two indices are:"+map.get(end)+" "+i);
                break;
            }
            map.put(arr[i],i);
        }
    }
}