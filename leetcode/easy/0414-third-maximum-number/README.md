# Third Maximum Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

Return the  **third distinct maximum**  number in this array. If the third  **maximum**  does not exist, return the  **maximum**  number.

 

 **Example 1:** 

```
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

```

 **Example 2:** 

```
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

```

 **Example 3:** 

```
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

```

 

 **Constraints:** 

- 1 <= nums.length <= 104
- -231 <= nums[i] <= 231 - 1

 

 **Follow up:**  Can you find an `O(n)` solution?

## Solution

**Language:** Java  
**Runtime:** 9 ms (beats 9.45%)  
**Memory:** 46.1 MB (beats 16.65%)  
**Submitted:** 2026-11-02T09:22:56.794Z  

```java
class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        int n=3;
        int count=0;
        int third_ele=Integer.MAX_VALUE;
        for(int num:nums)
        {
            set.add(num);
        }
        int size=set.size();
        for(int ele:set)
        {
            
            if(set.size()<3) third_ele=set.last();
            else if(count==size-3) {
                third_ele=ele;
                break;
            }
            count++;
        }
        return third_ele;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/third-maximum-number/)