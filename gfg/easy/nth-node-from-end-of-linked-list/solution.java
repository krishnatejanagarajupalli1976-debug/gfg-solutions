/* Structure of Linked List Node
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public int getKthFromLast(Node head, int k) {
        int count = 0;
        Node temp = head;

        while(temp != null) {
            count++;
            temp = temp.next;
        }

        if(k > count) {
            return -1;
        }

        temp = head;

        for(int i = 0; i < count-k; i++) {
            temp = temp.next;
        }

        return temp.data;
    }
}