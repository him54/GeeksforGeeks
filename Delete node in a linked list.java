/*
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    Node deleteMid(Node head) {
        if(head.next == null)
        {
            return null;
        }
        Node fast  = head;
        Node slow = head;
        Node mid = null;
        
        while(fast !=null && fast.next != null)
        {
            fast = fast.next.next;
            mid = slow;
            slow = slow.next;
        }
        mid.next = mid.next.next;
        
        
        return head;
    }
}
