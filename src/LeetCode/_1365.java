package LeetCode;

import java.util.Arrays;

public class _1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) if (i != j && nums[j] < nums[i]) count++;
            result[i] = count;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
