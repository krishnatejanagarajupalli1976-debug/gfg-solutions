# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 39.39%)  
**Memory:** 47.5 MB (beats 98.31%)  
**Submitted:** 2026-11-03T15:47:49.811Z  

```java
class Solution {
    public void reverseString(char[] s) {
        int size=s.length;
        int j=0;
        char[] rev=new char[size];
        for(int i=size-1;i>=0;i--)
        {
            rev[j]=s[i];
            j++;
        }
        for(int i=0;i<size;i++)
        {
            s[i]=rev[i];
        }
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)