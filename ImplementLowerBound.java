public class ImplementLowerBound {
        int lowerBound(int[] arr, int target) {
        // code here
        int l=0,h=arr.length,m;
        while(l<h)
        {
            m=(l+(h-1))/2;
            if(arr[m]<target)
            {
                l=m+1;
            }
            else{
                h=m;
            }
        }
        return l;
        
    }
}   