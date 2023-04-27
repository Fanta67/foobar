public class Solution {
    public static int[] solution(int[] x, int y) {
        // Your code here
        int res = 0;
        for (int i = 0; i < x.length; i++) {
            res ^= x[i];
        }
        for (int i = 0; i < y.length; i++) {
            res ^= y[i];
        }
        return res;
    }
}