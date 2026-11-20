# Rotate a Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a singly linked list, you need to left rotate the linked list  **k**  times. Return the head of the modified linked list.

 **Examples:** 

```
Input: k = 4,
   
Output: 50 -> 10 -> 20 -> 30 -> 40
Explanation:
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40
   
```

```
Input: k = 6,
   
Output: 30 -> 40 -> 10 -> 20 
   
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T16:05:24.543Z  

```java

class Solution {
    public Node rotate(Node head, int k) {

        if(head == null || head.next == null || k == 0)
            return head;

        Node temp = head;
        int len = 1;

        while(temp.next != null) {
            temp = temp.next;
            len++;
        }

        k = k % len;

        if(k == 0)
            return head;

        temp.next = head;

        Node newTail = head;

        for(int i = 1; i < k; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;

        newTail.next = null;

        return newHead;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1)