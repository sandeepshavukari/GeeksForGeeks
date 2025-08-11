import java.util.Stack;
public class CheckIfLinkedListIsPalindrome {
    static boolean isPalindrome(Node head) {
        Stack<Integer> s= new Stack<>();
        Node temp= head;
        Node new_node=null;
        while(temp!=null)
        {
            s.push(temp.data);
            temp=temp.next;
        }
        while(!s.isEmpty())
        {
            if(new_node==null)
            {
                new_node = new Node(s.pop());
                temp=new_node;
            }
            else
            {
                temp.next= new Node(s.pop());
                temp=temp.next;
            }
        }
        while(head!=null&&new_node!= null)
        {
            if(head.data!=new_node.data)
            {
                return false;
            }
            head=head.next;
            new_node= new_node.next;
        }
        return true;
    }
}