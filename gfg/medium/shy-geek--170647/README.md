# Count Chocolates Bought with k Coins

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Geek has  **k**  coins and wants to buy chocolates from a shop. The shop has different types of chocolates whose prices are given in a sorted array  **price[]**  in increasing order. There is an infinite supply of every type of chocolate. Geek always buys the costliest chocolate he can afford. After buying a chocolate, its price is deducted from the remaining coins. He repeats this process until he cannot afford any chocolate. Return the total number of chocolates Geek buys.

 **Note:**  All chocolate prices are pairwise distinct.

 **Examples:** 

```
Input: k = 5, price[] = [2, 4, 6]
Output: 1
Explanation: The prices of chocolates are [2, 4, 6] and Geek had 5 coins with him. So he can only buy chocolate that costs 4 coins (since he always picks the costliest one).
```

```
Input: k = 9, price[] = [1, 2, 3, 4]
Output: 3
Explanation: The prices of chocolates are [1, 2, 3, 4] and Geek had 9 coins with him. So he can buy two chocolates that cost 4 coins. Thereafter, he had only 1 coin with him, hence he will have 1 more chocolate (that costs 1 coin).
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T13:40:17.413Z  

```java
class Solution {
    public int maximumChocolates(int k, int[] price) {
        // code here
        int spend=k;
        int i=price.length-1;
        int count=0;
        while(k>0&&i>=0)
        {
            if(k>=price[i])
            {
            k=k-price[i];
            count++;
        }
        else
        {
            i--;
        }
        }
        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/shy-geek--170647/1)