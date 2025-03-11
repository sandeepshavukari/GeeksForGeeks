public class KthfromEndofLinkedList {
     // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        // Your code here
        int n=0;
        Node temp=head;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        if(k>n)
        return -1;
        int m=n-k-1;
        int ans;
        for(int i=0;i<=m;i++)
        {
            head=head.next;
            if(i==m)
            {
                ans=head.data;
            }
        }
        return head.data;
    }
}
