
import java.util.*;
public class TwoDsearchop {
public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int strtRow = 0;
        int endRow = m-1;
        while(strtRow <= endRow) {
        int midRow = strtRow + (endRow-strtRow)/2;
        if(matrix[midRow][0] <= target && target <= matrix[midRow][n-1]) {
            int low = 0;
            int high = n-1;
            while(low <= high) {
                int mid = low + (high-low)/2;
                if(matrix[midRow][mid] < target) {
                    low = mid+1;
                } else if(matrix[midRow][mid] > target) {
                    high = mid-1;
                } else {
                    return true;
                }
            }
            return false;
        }
        else if(target > matrix[midRow][n-1]) {
            strtRow = midRow +1;
        } else {
            endRow = midRow - 1;
        }
        }
        return false;
    }

public static void main(String[] args) {
        TwoDsearchop op = new TwoDsearchop();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 3;

        boolean result = op.searchMatrix(matrix, target);
        System.out.println("Target found:" + result);
    }
}