class Solution {
    public int firstElementKTime(int[] arr, int k) {
        // code here
        int[] freq=new int[1000001];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
            if(freq[arr[i]]==k)
            {
                return arr[i];
            }
            
        }
        return -1;
        
    }
}