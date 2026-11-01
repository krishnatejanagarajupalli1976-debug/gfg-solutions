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
**Runtime:** 46 ms (beats 5.11%)  
**Memory:** 52.5 MB (beats 5.29%)  
**Submitted:** 2026-11-01T16:32:44.877Z  

```java
class Solution {
    public String largestNumber(int[] nums) {
        for(int j=0;j<nums.length;j++)
        {
           for(int i=0;i<nums.length-1;i++)
        {
            int a=nums[i];
            int b=nums[i+1];
            String first="" +a+b;
            String second=""+b+a;
            if(first.compareTo(second)<0)
            {
                int temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }            
        }
          
        }
        String result="";
        for(int i=0;i<nums.length;i++)
        {
            result=result+nums[i];
        }
        if(result.charAt(0)=='0') return "0";
        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-number/)