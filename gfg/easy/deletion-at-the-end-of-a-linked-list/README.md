# Deletion at End of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a Linked List, delete the tail (i.e., the last node) of the Linked List and return the new  **head** of the modified Linked List.

 **Examples:** 

```
Input: head[] = [1, 2, 3, 4, 5]

Output: 1 -> 2 -> 3 -> 4
Explanation: After deleting tail from the given linked list, we'll be left with just 1 -> 2 -> 3 -> 4.

```

```
Input: head[] = [3, 12, 15]

Output: 3 -> 12
Explanation: After deleting tail from the given linked list, we'll be left with just 3 -> 12.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T12:28:47.963Z  

```java
/* Linked List Node Structure
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        if(head == null) return null;

        if(head.next == null) return null;
        Node temp=head;

        while(temp.next.next != null)
        {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/deletion-at-the-end-of-a-linked-list/1)