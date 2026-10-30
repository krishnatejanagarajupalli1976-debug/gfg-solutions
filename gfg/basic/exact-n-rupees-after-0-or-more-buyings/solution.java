class Solution {
    public boolean isPossible(int n) {
        int spend = 100 - n;

        for (int i = 0; i * 3 <= spend; i++) {
            if ((spend - i * 3) % 7 == 0) {
                return true;
            }
        }

        return false;
    }
}