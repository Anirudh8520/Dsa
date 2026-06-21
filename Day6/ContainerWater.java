import java.util.*;
public class ContainerWater {
    public int MaxArea(int []height) {
        int n = height.length;
        int maxarea = 0;
        for(int i=0,j=n-1;i<j; ) {
            int width = j-i;
            int minheight = Math.min(height[i],height[j]);
            int area = width*minheight;

            maxarea = Math.max(maxarea , area);
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter elements:");
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        ContainerWater cw = new ContainerWater();
        int answer = cw.MaxArea(arr);
        System.out.println("The max area is:"+answer);
        
    }
}
