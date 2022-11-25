package LeetCode;

public class _287 {
    public static int findDuplicate(int[] nums) {
        int result = 0;
        for (int index = 0; index < nums.length; index++) {
            while (nums[index] != index + 1 && nums[index] <= nums.length) {
                if (nums[index] == index + 1) break;
                else if (nums[index] == nums[nums[index] - 1]) {
                    result = nums[index];
                    break;
                }
                else swapArrayElements(nums, index, nums[index] - 1);
            }
        }
        return result;
    }
    public static void swapArrayElements(int[] nums, int firstIndex, int secondIndex) {
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
    public static void main(String[] args) {
        int [] nums = {};
        System.out.println(findDuplicate(nums));
    }
}
