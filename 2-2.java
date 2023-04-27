public class Solution {
    public static int[] solution(int h, int[] q) {
		int max = (int)Math.pow(2,h) - 1;
		int[] res = new int[q.length];

		for (int i = 0 ; i < q.length ; i++) {
			if (q[i] < max)
				res[i] = map(max,q[i],(max - 1) / 2);
			else 
				res[i] = -1;
		}

		return res;
	}
	
    public static int map(int size, int target, int subtreeSize) {
		int right = size - 1;
		int left = right - subtreeSize;

		if (right == target || left == target)
			return size;
		
		if (target <= left)
			return map(left,target,(subtreeSize - 1) / 2);
		else
			return map(right,target,(subtreeSize - 1) / 2);
	}
}