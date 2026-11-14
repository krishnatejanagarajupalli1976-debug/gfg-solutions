/* Structure for Linked List node
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
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        while(head!=null)
        {
           res.add(head.data);
           head=head.next;
        }
        return res;
    }
}