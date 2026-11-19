class Solution {
    public int findKthSmall(int[] arr, int k) {
        // code here
        Arrays.sort(arr);

        int n = arr[arr.length - 1];
        int missing = 0;

        for(int i = 0; i < arr.length; i++)
        {
            missing = arr[i] - (i + 1);

            if(missing >= k)
            {
                return arr[i] - (missing - k + 1);
            }
        }

        return n + (k - missing);
    }
}