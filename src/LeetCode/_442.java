package LeetCode;

import java.util.List;

public class _442 {
    public static List<Integer> findDuplicates(int[] nums) {
        int resultIndex = 0;
        List<Integer> result = new java.util.ArrayList<>(List.of());
        for (int index = 0; index < nums.length; index++) {
            while (nums[index] != index + 1 && nums[index] <= nums.length) {
                if (nums[index] == index + 1) break;
                else if (nums[index] == nums[nums[index] - 1]) {
                    result.add(resultIndex, nums[index]);
                    resultIndex++;
                    break;
                }
                else swapArrayElements(nums, index, nums[index] - 1);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            for (int j = i+1; j < result.size(); j++) {
                if(result.get(i).equals(result.get(j))) {
                    result.remove(j);
                    j--;
                }
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
        System.out.println(findDuplicates(nums));
    }
}
