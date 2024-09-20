class TransposeOfMatrix
{
    public void transpose(int n,int a[][])
    {
        int ar[][]= new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                a[i][j]=a[i][j]^a[j][i];
                a[j][i]=a[i][j]^a[j][i];
                a[i][j]=a[i][j]^a[j][i];
            }
        }
    }
}
