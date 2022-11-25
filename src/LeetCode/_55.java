package LeetCode;

public class _55 { //TBD
    public static boolean canJump(int[] nums) {
        boolean bool = false;
        if (nums.length == 1) return true;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1 || i != 0 && i + nums[i] == nums[i]) break;
            else if(nums[i]==0) break;
            else if(i+nums[i]==nums.length-1){
                bool = true;
                break;
            }
            i += nums[i];
        }
        return bool;
    }
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0};
        System.out.println(canJump(nums));
    }
}
