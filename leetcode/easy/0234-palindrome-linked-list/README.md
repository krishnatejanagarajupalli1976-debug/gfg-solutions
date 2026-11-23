# Palindrome Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the `head` of a singly linked list, return `true` *if it is a  **palindrome**  or* `false` *otherwise*.

 

 **Example 1:** 

```
Input: head = [1,2,2,1]
Output: true

```

 **Example 2:** 

```
Input: head = [1,2]
Output: false

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [1, 105].
- 0 <= Node.val <= 9

 

 **Follow up:**  Could you do it in `O(n)` time and `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 7 ms (beats 29.20%)  
**Memory:** 99.1 MB (beats 22.58%)  
**Submitted:** 2026-11-23T02:53:55.235Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> res=new ArrayList<>();
        while(temp!=null)
        {
            res.add(temp.val);
            temp=temp.next;

        }
        int i=0;
        int j=res.size()-1;
        while(i<j)
        {
            if(!res.get(i).equals(res.get(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-linked-list/)