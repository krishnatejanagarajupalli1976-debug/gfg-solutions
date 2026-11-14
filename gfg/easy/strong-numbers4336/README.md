# Strong Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A Strong Number is a number whose value is equal to the sum of the factorials of its digits.

Given a positive integer  **n**, find if it is a Strong Number.

 **Examples:** 

```
Input: 145
Output: true
Explanation: The sum of the factorials of its digits is: 1! + 4! + 5! = 1 + 24 + 120 = 145.
Since the sum equals the original number, 145 is a Strong Number.

```

```
Input: 5314
Output: false
Explanation: The sum of the factorials of its digits is not equal to 5314. Therefore, it is not a Strong Number.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T09:03:49.883Z  

```java
class Solution {
    public boolean isStrong(int n) {
        // code here
        int dup=n;
        int rem=0;
        int fact=1;
        int sum=0;
        while(n!=0)
        {
            rem=n%10;
            fact=1;
            for(int i=rem;i>0;i--)
            {
                fact*=i;
            }
            sum+=fact;
            n=n/10;
        }
        return sum==dup;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/strong-numbers4336/1)