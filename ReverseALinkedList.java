// function Template for Java

import java.util.Stack;

class Node {
    int data;
    Node next;
    Node(int value) {
        this.data = value;
    }
}



class ReverseALinkedList {
    Node reverseList(Node head) {
        // code here
        Stack<Integer> s= new Stack<>();
        while(head!=null)
        {
            s.push(head.data);
            head=head.next;
        }
        Node new_node=null;
        Node temp=null;
        while(!s.isEmpty())
        {
            if(new_node==null)
            {
                new_node= new Node(s.pop());
                temp=new_node;
            }
            else
            {
                temp.next= new Node(s.pop());
                temp=temp.next;
            }
        }
    
        return new_node;    
    }
}
