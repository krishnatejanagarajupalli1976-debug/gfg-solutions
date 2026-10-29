# Kth of Spiral Matrix Traversal

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a matrix  **mat[][]**  and a number k, find the  **k-th**  element obtained while traversing the matrix in spiral order.

 **Note:**  Spiral traversal follows a pattern where we move left to right on the top row, top to bottom on the last column, right to left on the bottom row, and bottom to top on the first column, repeating this process for the inner layers until all elements are visited.

 **Examples**  **:** 

```
Input: mat[][] = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]], k = 10
Output: 13
Explanation:
 
The spiral order of matrix will look like 1->2->3->4->8->12->16->15->14->13->9->5->6->7->11->10. So the 10th element in this order is 13. 
```

```
Input: mat[][] = [[1, 2, 3], [4, 5, 6], [7, 8, 9]], k = 4
Output: 6
Explanation: The spiral order of matrix will look like 1->2->3->6->9->8->7->4->5. So the 4th element in this order is 6.
```

 **Constraints:** 
1<=n,m<=103
1<=k<=n*m
-109 <= A[i][j] <= 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T16:52:18.759Z  

```java
class Solution {
    public int findK(int[][] mat, int k) {
        // code here
        int[] res=new int[mat.length*mat[0].length];
        int rowstart=0,rowend=mat.length-1;
        int colstart=0,colend=mat[0].length-1;
        //int count=0;
        int j=0;
        while(rowstart<=rowend && colstart<=colend)
        {
            for(int i=colstart;i<=colend;i++)
            {
                res[j]=mat[rowstart][i];
                j++;
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++)
            {
                res[j]=mat[i][colend];
                j++;
            }
            colend--;
            if(rowstart<=rowend)
            {
            for(int i=colend;i>=colstart;i--)
            {
                res[j]=mat[rowend][i];
                j++;
            }
            rowend--;
            }
            if(colstart<=colend)
            {
            for(int i=rowend;i>=rowstart;i--)
            {
                res[j]=mat[i][colstart];
                j++;
            }
            colstart++;
            }
        }
        return res[k-1];
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-nth-element-of-spiral-matrix/1)