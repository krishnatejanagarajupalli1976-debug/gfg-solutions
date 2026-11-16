/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count%2==0;
    }
}