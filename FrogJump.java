import java.util.Arrays;

public class FrogJump {
    public static int minHei(int n,int ar[],int dp[])
    {
        
        if(n==0)return 0;
        if(dp[n]!=-1) return dp[n];
        int r=Integer.MAX_VALUE;
        int l=minHei(n-1,ar,dp)+Math.abs(ar[n]-ar[n-1]);
        if(n>1)
        r=minHei(n-2,ar,dp)+Math.abs(ar[n]-ar[n-2]);
        return dp[n]=Math.min(l,r);
    }
    int minCost(int[] height) {
        // code here
        int n=height.length-1;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        return FrogJump.minHei(n,height,dp);
    }
}
