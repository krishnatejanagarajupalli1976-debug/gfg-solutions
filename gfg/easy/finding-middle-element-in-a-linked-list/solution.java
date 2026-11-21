/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        int recount=0;
        
            while(temp!=null)
            {
                if(recount==count/2)
                {
                    return temp.data;
                }
                temp=temp.next;
                recount++;
            }
        
        // else
        // {
        //     while(temp!=null)
        //     {
        //         if(recount==(count/2)+2)
        //         {
        //             return temp.data;
        //         }
        //         temp=temp.next;
        //     }
        // }
        return -1;
        
    }
}