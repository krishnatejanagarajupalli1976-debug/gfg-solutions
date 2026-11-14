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

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T12:12:12.692Z  

```py
'''Structure of Linked List Node
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
'''

class Solution:
    def deleteHead(self, head):
        # code here
        if head==None:
            return None
        head=head.next
        return head
    
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-head-of-linked-list/1)