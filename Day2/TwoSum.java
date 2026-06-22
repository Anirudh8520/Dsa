import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HashMap<Integer , Integer> map = new HashMap<>();
        System.out.println("enter the size");
        int n = sc.nextInt();
        System.out.println("enter target:");
        int target = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt(); 
        
    }
    for(int i=0; i<n; i++) {
       for(int j=i+1; j<n; j++) {
        if(arr[i]+arr[j] == target) {
            System.out.println("the elements are:"+arr[i] +" "+arr[j]);
        }
       }

}
}
}
