import java.util.*;
public class Pow {
    public double myPow(double x, int n) {
        if( n== 0) return 1.0;
        if(x==0) return 0.0;
        if(x==1) return 1.0;
        if( x==-1 && n%2==0) return 1.0;
        if( x==-1 && n%2!=0) return -1.0;
        long binform = n;
        if(n < 0) {
            x = 1/x;
            binform = -(binform);
        }
        double ans = 1;
        while ( binform > 0) {
            if(binform%2 == 1) {
                ans=ans*x;
            }
            x*=x;
            binform /=2;
        }
        return ans;
        
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base:");
        int x = sc.nextInt();
        System.out.println("enter power:");
        int n = sc.nextInt();
        Pow p = new Pow();
        double ans = p.myPow(x, n);
        System.out.println("the power is:"+ans);
    }
}
