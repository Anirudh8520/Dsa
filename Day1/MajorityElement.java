import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
         int arr[] = {3,2,3};
        int n = arr.length;
        int count = 1;
        int majority = arr[0];
        for(int i=0; i<n; i++) {
            if(arr[i] == majority) {
                count ++;
            } else {
                count --;
            }
            if(count == 0) {
                majority = arr[i];
                count = 1;
            }
            
        }
        int freq = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == majority) {
               freq++;
            }
        }
        if(freq > n/2) {
            System.out.println(majority);
        } else {
            System.out.println("No majoirty element");
        }
        
    }
}