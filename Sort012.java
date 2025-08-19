public class Sort012{
      public void sort012(int[] arr) {
        // code here
        int zc=0,oc=0,tc=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)zc++;
            else if(arr[i]==1)oc++;
            else tc++;
        }
        int in=0;
        while(zc-->0)arr[in++]=0;
        while(oc-->0)arr[in++]=1;
        while(tc-->0)arr[in++]=2;
    }
}