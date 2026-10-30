class Solution {
    public int maximumChocolates(int k, int[] price) {
        // code here
        int count=0;
        for(int i=price.length-1;i>=0;i--)
        {
            if(k>=price[i])
            {
                count=count+k/price[i];
                k=k%price[i];
            }
        }
        return count;
        
    }
}