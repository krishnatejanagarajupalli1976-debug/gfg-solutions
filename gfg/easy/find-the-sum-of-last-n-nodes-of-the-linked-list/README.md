# Sum of Last n in Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the  **head** of a singly linked list and an integer  **n**, compute the sum of the last n nodes of the linked list.  If n is greater than or equal to the number of nodes in the linked list,  then return total sum.

  **Examples:** 

```
Input: Linked List: 5->9->6->3->4->10, n = 3

Output: 17
Explanation: The sum of the last three nodes in the linked list is 3 + 4 + 10 = 17.
```

```
Input: Linked List: 1->2, n = 2

Output:  3
Explanation: The sum of the last two nodes in the linked list is 2 + 1 = 3.
```

**Constraints:
**1 ≤ number of nodes, n ≤ 105
1 ≤ node->data ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-24T16:01:57.221Z  

```java
/* Structure for link list Node
class Node {
  public:
    int data;
    public Node next;
    public Node(int val) {
        data = val;
        next = null;
    }
}; */

class Solution {
    public int sumofNodes(Node head, int n) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null)
        { 
            count++;
            temp=temp.next;
            
        }
        temp=head;
        int pos=count-n;
        while(pos>0)
        {
            temp=temp.next;
            pos--;
        }
        int sum=0;
        while(temp!=null)
        {
            sum+=temp.data;
            temp=temp.next;
        }
        return sum;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-sum-of-last-n-nodes-of-the-linked-list/1)