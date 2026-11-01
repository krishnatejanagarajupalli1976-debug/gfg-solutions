# Largest Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a list of non-negative integers `nums`, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

 **Example 1:** 

```
Input: nums = [10,2]
Output: "210"

```

 **Example 2:** 

```
Input: nums = [3,30,34,5,9]
Output: "9534330"

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 0 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 14.47%)  
**Memory:** 46.1 MB (beats 8.27%)  
**Submitted:** 2026-11-01T16:50:13.482Z  

```java
class Solution {
    public String largestNumber(int[] nums) {
        Integer[] arr=new Integer[nums.length];
        for(int j=0;j<nums.length;j++)
        {
            arr[j]=nums[j];
        }
           
            Arrays.sort(arr,(a,b)->{
                String first="" +a+b;
                String second="" +b+a;
               return second.compareTo(first);
            });
        String result="";
        for(int i=0;i<nums.length;i++)
        {
            result=result+arr[i];
        }
        if(arr[0]==0) return "0";
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-number/)