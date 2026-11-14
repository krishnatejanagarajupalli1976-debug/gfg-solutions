# Delete Head of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a Linked List,  **delete** the **head** of the Linked List and return the  **new**  head of the modified Linked List.
 **Note:** Set the original head to NULL.

 **Examples:** 

```
Input:
   
Output: 2 -> 3 -> 1 -> 7
Explanation: After deleting head from the given linked list, we'll be left with just 2 -> 3 -> 1 -> 7.
    
```

```
Input:
   
Output: 5 -> 7 -> 8 -> 99 -> 100
Explanation: After deleting head from the given linked list, we'll be left with just 5 -> 7 -> 8 -> 99 -> 100.
   

```

 **Constraints:** 
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T12:10:15.552Z  

```java
/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
} */

class Solution {
    public Node deleteHead(Node head) {
        // code here
        //head=head.next;
        if(head==null)
        {
            return null;
        }
            head=head.next;
           return head;
        
       
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-head-of-linked-list/1)