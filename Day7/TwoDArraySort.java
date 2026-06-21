import java.util.*;
public class TwoDArraySort {
    
    public static boolean binarySearch(int[] row, int target) {
    int left = 0;
    int right = row.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (row[mid] == target) {
            return true;
        } else if (row[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return false;
}
public  static boolean searchMatrix(int [][]matrix, int target) {
    int m = matrix.length;
    int n = matrix[0].length;
    for(int i=0; i<n; i++) {
        if(binarySearch(matrix[i],target)) {
            return true;
        } 
            
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][]= {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean result = searchMatrix(matrix,target);
        System.out.println(result);
    }
}
    

