import java.util.*;

public class PrimeSum {
    public static boolean isPrime(int x) {
        if (x<2) return false;
        for (int i=2;i*i<=x;i++) {
            if (x%i==0) return false;
        }
        return true;
    }

    public static int getSum(int a[],int n) {
        Arrays.sort(a);
        int sum =0,psum=0,maxp =-1;
        for (int i=0;i<n;i++) {
            sum +=a[i];
            if (isPrime(a[i])) {
                psum +=a[i];
                maxp =a[i];
            }
        }
        if (maxp == -1) return sum-a[n-1];
        return psum-maxp;
    }

    public static void main(String args []) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int[] a =new int[n];
        for (int i=0;i<n;i++) {
            a[i] =sc.nextInt();
        }
        System.out.println(getSum(a,n));
    }
}
