# Linked List Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given the  **head**  of a singly linked list, return an array containing the values of its nodes.

 **Examples:** 

```
Input:
    
Output: [1, 2, 3, 4, 5]
Explanation: The linked list contains 5 elements [1, 2, 3, 4, 5]. The elements are printed in a single line.
```

```
Input:
    
Output: [10, 20, 30, 40, 50, 60]
Explanation: The linked list contains 6 elements [10, 20, 30, 40, 50, 60]. The elements are printed in a single line.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T09:15:24.105Z  

```java
/* Structure for Linked List node
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
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        while(head!=null)
        {
           res.add(head.data);
           head=head.next;
        }
        return res;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1)