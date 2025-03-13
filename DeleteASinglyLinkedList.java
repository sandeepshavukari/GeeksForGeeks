public class DeleteASinglyLinkedList {
    Node deleteNode(Node head, int x) {
        // code here
        if (head == null) return null;
        if (x == 1) return head.next;
        Node prev = null;
        Node curr = head;
        int count = 1;
        while (curr != null && count < x) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        if (curr == null) return head;
        prev.next = curr.next;
        return head;
    }
}