/* Structure for link list Node
class Node {
  public:
    int data;
    public Node next;
    public Node(int val) {
        data = val;
        next = null;
    }
}; */

class Solution {
    public int sumofNodes(Node head, int n) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null)
        { 
            count++;
            temp=temp.next;
            
        }
        temp=head;
        int pos=count-n;
        while(pos>0)
        {
            temp=temp.next;
            pos--;
        }
        int sum=0;
        while(temp!=null)
        {
            sum+=temp.data;
            temp=temp.next;
        }
        return sum;
    }
};