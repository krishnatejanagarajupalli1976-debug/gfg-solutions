class Solution {
    public int maxPackages(int[] arr, int totalTime) {
        // code here
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        int k=Math.min(totalTime,arr.length);
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
    }
    maxi=sum;
    for(int i=k;i<arr.length;i++)
    {
        sum=sum-arr[i-k]+arr[i];
        
        maxi=Math.max(maxi,sum);
    }
    return maxi;
}}