import java.util.Arrays;

public class MaxCoins_312 {

    // 3 1 5 8
    public int maxCoins(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, maxCoins(nums, i));
        }
        return max;
    }

    public int maxCoins(int[] nums, int index) {
        return 1;
    }
}
