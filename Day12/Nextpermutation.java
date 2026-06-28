import java.util.*;

public class Nextpermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind1 = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind1 = i;
                break;
            }
        }
        if (ind1 == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        int ind2 = -1;
        for (int i = n - 1; i > ind1; i--) {
            if (nums[i] > nums[ind1]) {
                ind2 = i;
                break;
            }
        }
        swap(nums, ind1, ind2);
        reverse(nums, ind1 + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Nextpermutation np = new Nextpermutation();
        int[] nums = {1, 3, 2};
        np.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
