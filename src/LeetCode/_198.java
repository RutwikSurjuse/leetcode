package LeetCode;

public class _198 {
    public static int rob(int[] nums) {
        int moneyOdd = 0;
        int moneyEven = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i%2!=0) moneyOdd += nums[i];
            else moneyEven += nums[i];
        }
        return Math.max(moneyOdd, moneyEven);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }
}
