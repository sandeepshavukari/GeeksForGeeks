public class MinimumElementInaSortedAndRotatedArray {
    public int findMin(int[] arr) {
        // complete the function here
        int min=Integer.MAX_VALUE;
        int l=0;
        int h=arr.length-1;
        int m=0;
        while(l<=h)
        {
            m=(l+h)/2;
            if(arr[m]<=arr[h])
            {
                min=Math.min(arr[m],min);
                h=m-1;
            }
            else
            {
                min=Math.min(arr[m],min);
                l=m+1;
            }
        }
        return min;
    }
}
