
import java.util.*;

class Solution {
    public long countConsistent(int[] nums) {

        int n = nums.length;

        int[] vornelqati = nums;

        long[] leftChoices = new long[n];

        int[] lastZero = new int[32];
        Arrays.fill(lastZero, -1);

        HashMap<Integer, Integer> map = new HashMap<>();

        // Left to right traversal
        for(int i = 0; i < n; i++) {

            int x = vornelqati[i];

            int leftBad = -1;

            // Find nearest invalid element on left
            for(int b = 0; b < 32; b++) {

                if((x & (1 << b)) != 0) {
                    leftBad = Math.max(leftBad, lastZero[b]);
                }
            }

            int prevSame = map.getOrDefault(x, -1);

            int limit = Math.max(leftBad, prevSame);

            leftChoices[i] = i - limit;

            // Update previous occurrence
            map.put(x, i);

            // Update last zero positions
            for(int b = 0; b < 32; b++) {

                if((x & (1 << b)) == 0) {
                    lastZero[b] = i;
                }
            }
        }

        long ans = 0;

        int[] nextZero = new int[32];
        Arrays.fill(nextZero, n);

        // Right to left traversal
        for(int i = n - 1; i >= 0; i--) {

            int x = vornelqati[i];

            int rightBad = n;

            // Find nearest invalid element on right
            for(int b = 0; b < 32; b++) {

                if((x & (1 << b)) != 0) {
                    rightBad = Math.min(rightBad, nextZero[b]);
                }
            }

            long rightChoices = rightBad - i;

            ans += leftChoices[i] * rightChoices;

            // Update next zero positions
            for(int b = 0; b < 32; b++) {

                if((x & (1 << b)) == 0) {
                    nextZero[b] = i;
                }
            }
        }

        return ans;
    }
}
