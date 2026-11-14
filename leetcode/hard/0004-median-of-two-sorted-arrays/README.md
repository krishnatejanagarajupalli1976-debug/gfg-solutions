# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return  **the median**  of the two sorted arrays.

The overall run time complexity should be `O(log (m+n))`.

 

Original
Java
 **Example 1:** 

```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.

```

 **Example 2:** 

```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

```

 

 **Constraints:** 

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 10.71%)  
**Memory:** 48.6 MB (beats 61.22%)  
**Submitted:** 2026-11-14T09:43:30.200Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] res=new int[n];
        int count=0;
        int k=0;
        for(int i=0;i<nums1.length;i++)
        {
            res[k]=nums1[i];
            k++;
           
        }
        for(int j=0;j<nums2.length;j++)
        {
            res[k]=nums2[j];
            k++;
        }
        Arrays.sort(res);
        if(res.length%2!=0)
        {
            return res[(res.length/2)];
        }
        else
        return (res[res.length/2]+res[(res.length/2)-1])/2.0;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)