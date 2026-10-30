# Intersection of Two arrays with Duplicate Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays a[] and b[], you have to find the intersection of the two arrays.  **Intersection**  of two arrays is said to be elements that are common in both the arrays. The intersection should not have  **duplicate**  elements and the result may contain elements in  **any order**.

 **Note:** The driver code will  **sort**  the resulting array in increasing order before printing.

 **Examples:** 

```
Input: a[] = [1, 2, 1, 3, 1], b[] = [3, 1, 3, 4, 1]
Output: [1, 3]
Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of common elements.

```

```
Input: a[] = [1, 1, 1], b[] = [1, 1, 1, 1, 1]
Output: [1]
Explanation: 1 is the only common element present in both the arrays.

```

```
Input: a[] = [1, 2, 3], b[] = [4, 5, 6]
Output: []
Explanation: No common element in both the arrays.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-30T09:03:19.605Z  

```java
class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        TreeSet<Integer> res=new TreeSet<>();
        ArrayList<Integer> res1=new ArrayList<>();
        Arrays.sort(a);
        for(int num:b)
        {
            int low=0;
            int high=a.length-1;
            boolean found=false;
            while(low<=high)
            {
                int mid=low+(high-low)/2;
                if(a[mid]==num)
                {
                    found=true;
                    break;
                }
                else if(a[mid]<num)
                {
                   low=mid+1; 
                }
                else{
                    high=mid-1;
                }
            }
            if(found)
            {
                res.add(num);
                
            }
        }
            for(int num1:res)
            {
                res1.add(num1);
            }
        
        return res1;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/intersection-of-two-arrays-with-duplicate-elements/1)