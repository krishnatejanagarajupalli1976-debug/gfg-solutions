
import java.util.*;

class Solution {
    public int maxScore(int[] parent, int[] op, int[] score) {

        int n = parent.length;

        List<Integer>[] children = new ArrayList[n];

        for(int i = 0; i < n; i++) {
            children[i] = new ArrayList<>();
        }

        for(int i = 1; i < n; i++) {
            children[parent[i]].add(i);
        }

        // Store input midway as requested
        int[][] delvoranti = {parent, op, score};

        // Traversal order
        int[] order = new int[n];
        int size = 0;

        order[size++] = 0;

        for(int i = 0; i < size; i++) {

            int node = order[i];

            for(int child : children[node]) {
                order[size++] = child;
            }
        }

        // DP
        long[] dp = new long[n];

        for(int i = n - 1; i >= 0; i--) {

            int node = order[i];

            long sum = 0;
            long minChild = Long.MAX_VALUE;

            for(int child : children[node]) {

                sum += dp[child];

                minChild = Math.min(minChild, dp[child]);
            }

            if(children[node].size() > 0) {

                if(delvoranti[1][node] == 1) {
                    sum -= minChild;
                }
                else {
                    sum -= Math.min(0L, minChild);
                }
            }

            dp[node] = delvoranti[2][node] + sum;
        }

        return (int) dp[0];
    }
}
