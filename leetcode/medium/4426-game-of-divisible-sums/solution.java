
class Solution {
    public long maxDifference(int[] nums) {

        int n = nums.length;

        int[] merqulaven = nums;

        long[] dp = new long[n + 2];

        for(int i = n - 1; i >= 0; i--) {

            // Take one element
            long one = merqulaven[i];

            if(merqulaven[i] % 3 == 0) {
                one -= dp[i + 1];
            }
            else {
                one += dp[i + 1];
            }

            // Take two elements
            long two = Long.MIN_VALUE;

            if(i + 1 < n) {

                long sum = merqulaven[i] + merqulaven[i + 1];

                if(sum % 3 == 0) {
                    two = sum - dp[i + 2];
                }
                else {
                    two = sum + dp[i + 2];
                }
            }

            dp[i] = Math.max(one, two);
        }

        return dp[0];
    }
}
