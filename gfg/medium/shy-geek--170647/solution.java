class Solution {
    public int maximumChocolates(int k, int[] price) {
        // code here
        int spend=k;
        int i=price.length-1;
        int count=0;
        while(k>0&&i>=0)
        {
            if(k>=price[i])
            {
            k=k-price[i];
            count++;
        }
        else
        {
            i--;
        }
        }
        return count;
    }
}