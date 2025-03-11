public class FindingMiddleElementInALinkedList {
    int getMiddle(Node head) {
        // Your code here.
        int n=0,c=0;
        Node temp=head;
        while(head!=null)
        {
            n++;
            head= head.next;
        }
        c=n/2+1;
        int ans;
        for(int i=1;i<c;i++)
        {
            ans=temp.data;
            temp=temp.next;
        }
        return temp.data;
        
    }
}