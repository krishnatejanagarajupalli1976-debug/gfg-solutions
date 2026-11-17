/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int getNode(Node head, int k) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
          
            if(count==k)
            {
                return temp.data;
            }
              temp=temp.next;
        }
        return -1;
    }
}