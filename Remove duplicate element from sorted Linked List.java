// TC - O(N)
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	   Node node = head;
       if(head == null)
       {
           return null;
       }
       
       while(node != null && node.next != null)
       { 
           if(node.data == node.next.data)
           {
               Node temp = node.next;
               node.next = temp.next;
               temp.next = temp;
           }
           else
           {
               node = node.next;
           }
           
       }
       return head;	
    }
}
