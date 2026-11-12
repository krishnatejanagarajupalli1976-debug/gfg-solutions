# Kth Largest Element in an Array

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums` and an integer `k`, return  *the*  `kth`  *largest element in the array*.

Note that it is the `kth` largest element in the sorted order, not the `kth` distinct element.

Can you solve it without sorting?

 

Original
Java
 **Example 1:** 

```
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

```

 **Example 2:** 

```
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

```

 

 **Constraints:** 

- 1 <= k <= nums.length <= 105
- -104 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 72 ms (beats 30.00%)  
**Memory:** 73.8 MB (beats 75.03%)  
**Submitted:** 2026-11-12T07:25:20.767Z  

```java
import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < nums.length; i++)
        {
            pq.add(nums[i]);

            if(pq.size() > k)
            {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/)