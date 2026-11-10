# Count Pairs with Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array  **arr[]**  and an integer  **target**. You have to count all pairs in the array such that their sum is equal to the given target.

 **Examples:** 

```
Input: arr[] = [1, 5, 7, -1, 5], target = 6 
Output: 3
Explanation: Pairs with sum 6 are (1, 5), (7, -1) and (1, 5). 
```

```
Input: arr[] = [1, 1, 1, 1], target = 2 
Output: 6
Explanation: Pairs with sum 2 are (1, 1), (1, 1), (1, 1), (1, 1), (1, 1), (1, 1).
```

```
Input: arr[] = [10, 12, 10, 15, -1], target = 125
Output: 0
Explanation: There is no pair with sum = target
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-10T13:04:59.929Z  

```java
import java.util.Arrays;

class Solution {
    int countPairs(int arr[], int target) {

        Arrays.sort(arr);

        int count = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum == target) {

                if(arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                }

                int a = arr[left];
                int b = arr[right];

                int c1 = 0;
                int c2 = 0;

                while(left <= right && arr[left] == a) {
                    c1++;
                    left++;
                }

                while(right >= left && arr[right] == b) {
                    c2++;
                    right--;
                }

                count += c1 * c2;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        return count;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum--150253/1)