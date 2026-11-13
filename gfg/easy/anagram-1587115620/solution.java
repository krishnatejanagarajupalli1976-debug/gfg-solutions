class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        if(s1.length()!=s2.length()) return false;
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<s1.length();i++)
        {
            if(c1[i]!=c2[i])
            return false;
        }
        return true;
        
    }
}