# Intersection of Two Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must be  **unique**  and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 97.89%)  
**Memory:** 44.4 MB (beats 93.54%)  
**Submitted:** 2026-10-30T06:16:30.413Z  

```java
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        // int[] mat=new int[set1.size()];
        for(int num:nums1)
        {
            set1.add(num);
        }
        for(int num:nums2)
        {
            if(set1.contains(num))
            set2.add(num);
        }
        
        int[] mat=new int[set2.size()];
        int i=0;
        for(int j:set2)
        {
            mat[i++]=j;
        }
        return mat;
        
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays/)