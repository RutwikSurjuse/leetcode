package LeetCode;

public class _268 {
    public static int missingNumber(int[] nums) {
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            while (nums[index] != index) {
                if (nums[index] == nums.length) break;
                swapArrayElements(nums, index, nums[index]);
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                result = index;
                break;
            }
            else result = nums.length;
        }
        return result;
    }
    public static void swapArrayElements(int[] nums, int firstIndex, int secondIndex) {
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(missingNumber(nums));
    }
}
