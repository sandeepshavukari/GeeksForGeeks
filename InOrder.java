import java.util.ArrayList;

class Node {
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
}
public class InOrder {
    ArrayList<Integer> inOrder(Node root) {
        // Code
        ArrayList<Integer>ar= new ArrayList<>();
        if(root!=null){
        ar.addAll(inOrder(root.left));
        ar.add(root.data);
        ar.addAll(inOrder(root.right));
        }
        return ar;
    }
}
