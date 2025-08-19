import java.util.Arrays;

public class MedianinarowwisesortedMatrix {
    public int median(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int ar[]= new int [n*m];
        int k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                ar[k++]=mat[i][j];
            }
        }
        Arrays.sort(ar);
        if(ar.length%2!=0)
        return ar[ar.length/2];
        else
        return (ar[ar.length/2]+ar[(ar.length/2)+1])/2;
    }
}
