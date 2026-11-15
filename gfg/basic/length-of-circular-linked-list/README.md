# Length of Circular Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a circular linked list of size **n**, find the length of the list (total number of nodes).

 **Examples:** 

```
Input: node[] = [1, 2, 3, 4, 5]
 
Output: 5

```

```
Input: node = [2, 5, 7, 8, 99, 100]

Output: 6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-15T02:22:45.948Z  

```java
/* Linked List Node Structure
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public static int getLength(Node head) {
        // code here
        Node temp=head;
        int count=0;
        do
        {
            count++;
            temp=temp.next;
        }
        while(temp!=head);
        return count;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/length-of-circular-linked-list/1)