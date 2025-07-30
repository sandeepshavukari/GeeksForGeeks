public class MaxSumWithoutAdjacents {
    public static int ans(int n,int ar[],int dp[])
    {
        if(n==0) 
        return dp[n]=ar[n];
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        int p=ar[n]+ans(n-2,ar,dp);
        int np=0+ans(n-1,ar,dp);
        return dp[n]=Math.max(p,np);
        
    }
    int findMaxSum(int ar[]) {
        // code here
        int n= ar.length-1;
        int dp[]= new int [n+1];
        Arrays.fill(dp,-1);
        return MaxSumWithoutAdjacents.ans(n,ar,dp);
        
    }
}
