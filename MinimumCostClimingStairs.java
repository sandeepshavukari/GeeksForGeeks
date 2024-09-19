/**
 * MinimumCostClimingStairs
 */
class MinimumCostClimingStairs {
    static int minCostClimbingStairs(int[] cost , int N) {
        //Write your code here
        for(int i=0;i<N;i++)
        {
            if(i==0||i==1)
            continue;
            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[N-1],cost[N-2]);
    }
}
