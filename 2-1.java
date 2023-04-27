public class Solution {
    public static int[] solution(int[] l, int t) {
        // Your code here
        int slow = 0;
        int fast = 0;
        int sum = l[0];
        while (fast < l.length) {
            if (sum < t) {
                fast++;
                if (fast < l.length) {
                    sum += l[fast];
                }
            } else if (sum > t) {
                sum -= l[slow];
                slow++;
            } else {
                return new int[] {slow, fast};
            }
        }
        return new int[] {-1, -1};
    }
}