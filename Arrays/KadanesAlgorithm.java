import java.util.*;
public class KadanesAlgorithm {
    public static void main (String [] args) {
        
         int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int Maxsum = Integer.MIN_VALUE;
        int CurrentSum = 0;
        for(int i=0; i<n; i++) {
            CurrentSum += arr[i];
            Maxsum = Math.max(CurrentSum,Maxsum);
            if(CurrentSum < 0) {
                CurrentSum = 0;
            }
        }
        System.out.println("The Maximum subarray sum is:"+Maxsum);
        

}
}
  
