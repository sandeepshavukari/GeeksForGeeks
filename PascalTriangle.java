import java.util.ArrayList;

class PascalTriangle {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> ar= new ArrayList<>();
        int ans=1;
        ar.add(ans);
        for(int i=0;i<n-1;i++)
        {
            ans=ans*(n-1-i);
            ans=ans/(i+1);
            ar.add(ans);
        }
        return ar;
    }
}