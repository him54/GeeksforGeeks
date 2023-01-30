/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
       HashMap<Node,Integer> hm = new HashMap<>();
        Node node = head;
        while(node != null)
        {
            if(!hm.containsKey(node))
            {
                hm.put(node, 1);
            }
            else{
                return true;
            }
            node = node.next;
        }
        return false;
    }
}
