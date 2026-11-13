# Valid Anagram

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

 

Original
Java
 **Example 1:** 

 **Input:**  s = "anagram", t = "nagaram"

 **Output:**  true

 **Example 2:** 

 **Input:**  s = "rat", t = "car"

 **Output:**  false

 

 **Constraints:** 

- 1 <= s.length, t.length <= 5 * 104
- s and t consist of lowercase English letters.

 

 **Follow up:**  What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 67.22%)  
**Memory:** 45.8 MB (beats 45.55%)  
**Submitted:** 2026-11-13T17:03:36.247Z  

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        if(s.length()!=t.length()) return false;
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<s.length();i++)
        {
            if(c1[i]!=c2[i]) return false;
        }
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-anagram/)