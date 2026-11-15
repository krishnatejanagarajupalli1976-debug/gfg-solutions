class Solution {
    public int countConsistent(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length; i++) {

            int andValue = nums[i];
            int minValue = nums[i];

            for(int j = i; j < nums.length; j++) {

                andValue = andValue & nums[j];

                minValue = Math.min(minValue, nums[j]);

                if(andValue == minValue) {
                    count++;
                }
            }
        }

        return count;
    }
}