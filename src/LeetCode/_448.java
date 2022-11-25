package LeetCode;

import java.util.List;

public class _448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new java.util.ArrayList<>(List.of());
        int resIndex = 0;
        for (int index = 0; index < nums.length; index++) {
            while (nums[index] != index + 1 && nums[index] <= nums.length) {
                if (nums[index] == index + 1 || nums[index] == nums[nums[index] - 1]) break;
                else swapArrayElements(nums, index, nums[index] - 1);
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                result.add(resIndex, index + 1);
                resIndex++;
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
        int[] nums = {};
        System.out.println(findDisappearedNumbers(nums));
    }
}
