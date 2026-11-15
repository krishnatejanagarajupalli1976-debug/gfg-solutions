/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    boolean isCircular(Node head) {
        // code here
        Node temp=head;
        if(head==null) return true;
        temp=temp.next;
        while(temp!=head)
        {
            if(temp==null)
            return false;
            temp=temp.next;
        }
        return true;
    }
}