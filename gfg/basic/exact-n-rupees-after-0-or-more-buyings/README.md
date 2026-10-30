# Exact n Coins After 0 or More Buyings

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an integer  **n**, find whether Geek can have exactly n coins after buying 0 or more chocolates from a shop. 

- Geek initially has 100 coins
- The shop sells only two types of chocolates costing 3 coins and 7 coins respectively.
- Geek may buy any number of chocolates, including zero chocolates.

 **Examples:** 

```
Input: n = 99
Output: false
Explanation: Geek needs to save 99 coins. That means he can only spend 1 coin. But no chocolate is available for 1 coin. Therefore there is no way for him to save n coins. 
```

```
Input: n = 97
Output: true
Explanation: Geek can buy one chocolate for 3 coins and save 97 coins.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T14:06:52.970Z  

```java
class Solution {
    public boolean isPossible(int n) {
        int spend = 100 - n;

        for (int i = 0; i * 3 <= spend; i++) {
            if ((spend - i * 3) % 7 == 0) {
                return true;
            }
        }

        return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/exact-n-rupees-after-0-or-more-buyings/1)