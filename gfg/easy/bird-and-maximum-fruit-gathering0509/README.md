# Maximum Packages within Time

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A delivery agent has to deliver packages at locations arranged in a line. The number of packages at the **ith**  location is given by  **arr[i]**.

- The agent can start at any location and can only visit consecutive locations.
- Visiting each location takes 1 unit of time.

Given  **arr[]**  and  **totalTime**, find the maximum number of packages the agent can deliver within  **totalTime**.

 **Examples:** 

```
Input: arr[] = [2, 1, 3, 5, 0, 1, 4], totalTime = 3
Output: 9
Explanation: The agent can visit three consecutive locations. Starting from the second location, it delivers arr[1] + arr[2] + arr[3] = 1 + 3 + 5 = 9 packages.
```

```
Input: arr[] = [1, 6, 2, 5, 3, 4], totalTime = 2
Output: 8
Explanation: The agent can visit two consecutive locations. Starting from the second location, it delivers arr[1] + arr[2] = 6 + 2 = 8 packages. Starting from the fourth location gives arr[3] + arr[4] = 5 + 3 = 8 packages. Hence, the maximum is 8 packages.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-01T17:40:44.277Z  

```java
class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        // code here
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        int k=Math.min(totalTime,arr.length);
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
    }
    maxi=sum;
    for(int i=k;i<arr.length;i++)
    {
        sum=sum-arr[i-k]+arr[i];
        
        maxi=Math.max(maxi,sum);
    }
    return maxi;
}}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bird-and-maximum-fruit-gathering0509/1)