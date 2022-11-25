package LeetCode;

import java.util.Arrays;

public class _645 {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        for (int index = 0; index < nums.length; index++) {
            int correctValue = index + 1;
            while (nums[index] != correctValue) {
                int value = nums[index], valIndex = value - 1;
                if (nums[valIndex] == value) break;
                else swapIndex(nums, index, valIndex);
            }
        }
        for (int wrongIndex = 0; wrongIndex < nums.length; wrongIndex++) {
            int correctValue = wrongIndex + 1;
            if (nums[wrongIndex] != correctValue) {
                result[0] = nums[wrongIndex];
                result[1] = correctValue;
            }
        }
        return result;
    }

    public static void swapIndex(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
