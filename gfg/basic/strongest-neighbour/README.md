# Strongest Neighbour

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given an array  **arr[]**  consisting of positive integers. Return the maximum of all adjacent pairs in the array.

 **Examples:** 

```
Input: arr[] = [1, 2, 2, 3, 4, 5]
Output: [2, 2, 3, 4, 5]
Explanation: Maximum of arr[0] and arr[1] is 2, that of arr[1] and arr[2] is 2,... and so on.
```

```
Input: arr[] = [5, 5]
Output: [5]
Explanation: We only have two elements so max of 5 and 5 is 5 only.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T15:40:31.415Z  

```java
class Solution {
    public ArrayList<Integer> maxAdj(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                res.add(Math.max(arr[i],arr[j]));
                break;
            }
        }
        return res;
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/strongest-neighbour/1)