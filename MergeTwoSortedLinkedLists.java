public class MergeTwoSortedLinkedLists {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        ArrayList<Integer> ar= new ArrayList<>();
        Node temp1=head1;
        Node temp2=head2;
        // int i=0;
        while(temp1!=null)
        {
            ar.add(temp1.data);
            temp1=temp1.next;
            // i++;
        }
        while(temp2!=null)
        {
            ar.add(temp2.data);
            temp2=temp2.next;
            // i++;
        }
        Collections.sort(ar);
        Node new_node=null;
        Node ans=null;
        int k=0;
        int i=ar.size();
        while(k<i)
        {
            if(new_node==null)
            {
                new_node= new Node(ar.get(k));
                ans=new_node;
                k++;
            }
            else
            {
                ans.next= new Node(ar.get(k));
                ans=ans.next;
                k++;
            }
        }
        return new_node;
    }
}
