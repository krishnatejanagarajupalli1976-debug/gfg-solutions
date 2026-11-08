class Solution {
    public int maxSubarraySum(int[] arr) {

        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            // Write your two statements here
            currSum = Math.max(currSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}