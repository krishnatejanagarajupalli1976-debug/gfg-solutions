class Solution {
    public int findKthLargest(int[] a, int k) {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for(int i = 1; i <= k; i++)
        {
            max = Integer.MIN_VALUE;
            index = -1;

            for(int j = 0; j < a.length; j++)
            {
                if(max < a[j])
                {
                    max = a[j];
                    index = j;
                }
            }

            a[index] = Integer.MIN_VALUE;
        }

        return max;
    }
}