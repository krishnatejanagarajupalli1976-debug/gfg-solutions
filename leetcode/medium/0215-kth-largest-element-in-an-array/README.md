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
**Runtime:** 0 ms  
**Memory:** 41.8 MB  
**Submitted:** 2026-11-12T07:21:24.700Z  

```java
class Solution {
    public int findKthLargest(int[] a, int k) {
        int max=-1;
        int index=0;
        for(int i=1;i<=k;i++)
        {
            max=a[0];
            for(int j=0;j<a.length;j++)
            {
                if(max<a[j])
                {
                    max=a[j];
                    index=j;
                }
            }
            a[index]=Integer.MIN_VALUE;
        }
        return max;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-largest-element-in-an-array/)