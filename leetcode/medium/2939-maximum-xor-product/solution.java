class Solution {
    public int maximumXorProduct(long a, long b, int n) {
        long maxi=Integer.MIN_VALUE;
        long product=0;
        for(int i=0;i<Math.pow(2,n);i++)
        {
            product=(a^i)*(b^i);
            maxi=Math.max(maxi,(int)product);
        }
        return (int)maxi;        
        
    }
}