public class ImplementUpperBound {
    int upperBound(int[] arr, int target) {
        // code here
        int l=0,h=arr.length;
       while (l < h) 
       {
            int m = l+(h-l)/2;
            if (arr[m]>target) 
            {
                h = m;
            } 
            else 
            {
                l=m+1;
            }
        }
        return l;

    }
}
