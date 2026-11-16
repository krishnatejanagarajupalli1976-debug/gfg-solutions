/* Structure of a Node
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {
    public boolean areIdentical(Node head1, Node head2) {
        // code here
        int count1=0;
        int count2=0;
        Node temp1=head1;
        Node temp2=head2;
        while(temp1!=null)
        {
            count1++;
            temp1=temp1.next;
        }
        while(temp2!=null)
        {
            count2++;
            temp2=temp2.next;
        }
        if(count1!=count2) return false;
        while(head1!=null)
{
if(head1.data!=head2.data)
{
return false;
}
head1=head1.next;
head2=head2.next;
}
return true;
}}


    