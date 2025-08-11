
import java.util.Arrays;
public class Medianof2SortedArraysofDifferentSizes{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int ar[]= new int[n+m];
        int j=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=a[i];
        }
        for(int i=n;i<m+n;i++)
        {
            ar[i]=b[j];
            j++;
        }
        Arrays.sort(ar);
        if((n+m)%2==0)
        {
            int k=(n+m)/2;
            int l=k-1;
            int a1=ar[k];
            int a2=ar[l];
            double ans=(a1+a2)/2.0;
            return ans;
        }
        else
        return(ar[(n+m)/2]);
        
    }
}
