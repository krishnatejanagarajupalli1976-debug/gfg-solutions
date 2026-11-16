# Identical Linked Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two singly linked lists,  **head1**  and  **head2**, the task is to determine whether the two linked lists are identical.

Two linked lists are considered identical if they have the same number of nodes and each corresponding node contains the same data in the same order.

 **Examples:** 

```
Input: head1: 1->2->3->4->5->6, head2: 99->59->42->20
Output: false
Explanation: As shown in the below figure, the two lists are not identical.

```

```
Input: head1: 1->2->3->4->5, head2: 1->2->3->4->5
Output: true
Explanation: As shown in the below figure, the two lists are identical.
 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T02:19:41.068Z  

```java
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


    
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/identical-linked-lists/1)