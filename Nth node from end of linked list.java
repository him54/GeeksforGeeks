class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        Node p = head;
    	Node q = head;
    	int j = 0;
    	while(j < n && p != null)
    	{
    	    p = p.next;
    	    j++;
    	}
    	if(p == null && j < n)
    	{
    	    return -1;
    	}
    	
    	while(p != null)
    	{
    	    p = p.next;
    	    q = q.next;
    	}
    	
    	return q.data;
    }
}
