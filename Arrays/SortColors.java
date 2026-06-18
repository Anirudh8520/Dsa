import java.util.*;
public class SortColors {
     
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else { 
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        SortColors so = new SortColors();
        so.sortColors(arr);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
