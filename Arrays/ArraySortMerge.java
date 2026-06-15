import java.util.*;
public class ArraySortMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ele in arr1:");
        int m = sc.nextInt();
        System.out.println("Enter the number of ele in arr2:");
        int n = sc.nextInt();
        System.out.println("Enter the size of arr1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of arr2:");
        int n2 = sc.nextInt();
        int []arr1 = new int[n1];
        int []arr2 = new int[n2];
        for(int i=0; i<n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++) {
            arr2[j] = sc.nextInt();
        }
        for(int i=m, j=0; i<m+n && j<n;i++,j++) {
            arr1[i] = arr2[j];
            Arrays.sort(arr1);
        }
       for(int i=0; i<n1; i++) {
         System.out.println(arr1[i]);
       }
    }
}
