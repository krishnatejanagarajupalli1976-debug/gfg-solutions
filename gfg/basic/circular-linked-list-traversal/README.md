# Circular Linked List Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given the  **head**  of a circular linked list,  **print**  the data of the nodes in the linked list starting from the head node, traversing the list exactly once.

 **Examples:** 

```
Input:
 
Output: 1 7 8 10
Explanation: The traversal begins at the head node 1, then subsequent nodes 7, 8, and 10. 
```

```
Input:
 
Output: 2 5 7 8 10
Explanation: The traversal begins at head node 2, then subsequent nodes 5, 7, 8, and 10. 
```

 **Constraints:** 
1 ≤ number of nodes ≤ 50
0 ≤ node -> data ≤ 500

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-18T07:14:51.089Z  

```java
/* Structure of circular linked list node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public void printList(Node head) {
        // code here
        if(head==null) return;
        Node temp=head;
        do
        {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        while(temp!=head);
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/circular-linked-list-traversal/1)