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
**Runtime:** 30 ms (beats 5.11%)  
**Memory:** 52.5 MB (beats 5.29%)  
**Submitted:** 2026-11-01T16:52:29.229Z  

```java
import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        for(int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            for(int j = i + 1; j < n; j++) {

                int a = nums[maxIndex];
                int b = nums[j];

                String first = "" + a + b;
                String second = "" + b + a;

                if(first.compareTo(second) < 0) {
                    maxIndex = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        // Handle all zeros
        if(nums[0] == 0) {
            return "0";
        }

        String result = "";

        for(int i = 0; i < n; i++) {
            result = result + nums[i];
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/largest-number/)