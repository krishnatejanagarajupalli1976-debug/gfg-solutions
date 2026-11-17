# Node at Given Index

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the head of a singly linked list and an integer  **k**, find the value of the node present at the given  **1-based**  index x. Return  **-1**  if no node exists at the given index.

 **Examples :** 

```
Input: k = 3, 

Output: 3
Explanation: The node value at index 3 is 3.

```

```
Input: k = 6, 

Output: -1
Explanation: The linked list contains fewer than 6 nodes, so no node exists at index 6.

```

**Constraints:
**1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105
1 ≤ k ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-17T16:13:53.788Z  

```java
/*
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
    public int getNode(Node head, int k) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            count++;
          
            if(count==k)
            {
                return temp.data;
            }
              temp=temp.next;
        }
        return -1;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1)