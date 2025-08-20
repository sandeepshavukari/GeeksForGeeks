public class CountGoodNumbers {
    private static final long MOD=1000000007;
    public static int countGoodNumbers(long n){
        long even=(n+1)/2;
        long odd=n/2;
        long first=pow(5,even)%MOD;
        long second=pow(4,odd)%MOD;
        return (int)((first*second)%MOD);
    }
    private static long pow(long x,long n){
        if(n==0)return 1;
        long temp=pow(x,n/2);
        temp=(temp*temp)%MOD;
        if(n%2==0)return temp;
        else return (x*temp)%MOD;
    }
}
