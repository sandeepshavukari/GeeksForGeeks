//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
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
