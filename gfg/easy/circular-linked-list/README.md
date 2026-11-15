# Check if  Linked List is Circular

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head**  of a singly linked list, returns  **true** if the linked list is circular &  **false** if it is not circular. A linked list is called circular if it is not NULL terminated and all nodes are connected in the form of a cycle. 

 **Note:**  Linked list should not contain any inner loop and a empty linked list is always a circular linked list.

 **Examples:** 

```
Input: head = [2, 4, 6, 7, 5]

Output: true
Explanation: As shown in figure the first and last node is connected, i.e. 5 --> 2

```

```
Input: head = [2, 4, 6, 7, 5, 1]
 
Output: false
Explanation: As shown in figure this is not a circular linked list.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T02:29:03.163Z  

```java
/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/

class Solution {
    boolean isCircular(Node head) {
        // code here
        Node temp=head;
        if(head==null) return true;
        temp=temp.next;
        while(temp!=head)
        {
            if(temp==null)
            return false;
            temp=temp.next;
        }
        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/circular-linked-list/1)