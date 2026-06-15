import java.util.*;
public class MissingRepeatedValue {
    public static void main (String[] args) {
        int grid[][]  = { {1,3} , {2,2}};
        int n = grid.length;
        int size = n*n;
        int [] freq = new int[size+1];
        int repeated = 0, missing = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                freq[grid[i][j]]++;
            }
        }
        for(int i=1; i<size+1; i++) {
            if(freq[i] == 2) {
                repeated = i;
            }
            if(freq[i] == 0) {
                missing = i;
            }
        }
        System.out.println(Arrays.toString(new int[]{repeated,missing}));
    }
}
