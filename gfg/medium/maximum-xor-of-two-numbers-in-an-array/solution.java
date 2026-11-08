class Solution {
    public int maxXor(int[] arr) {
        // code here
        int maxi=Integer.MIN_VALUE;
        int xor=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                xor=arr[i]^arr[j];
                            maxi=Math.max(maxi,xor);

                
            }
        }
        return maxi;
    }
}