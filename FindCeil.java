public class FindCeil {
    public int findCeil(int[] ar, int x) {
        // code here
        int l=0;
        int h=ar.length-1;
        int ans=-1;
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(ar[m]>=x)
            {
                ans=m;
                h=m-1;
            }
            else
            {
                l=m+1;
            }
        }
        return ans;
    }
}