package LeetCode;

import java.util.Arrays;

public class _34 {
    public static int[] searchRange(int[] nums, int target) {
        int [] result = new int [2];
        for (int i = 0; i < 2; i++) {
            int start = 0, end = nums.length-1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) end = mid - 1;
                else if (target > nums[mid]) start = mid + 1;
                else {
                    result[i] = mid;
                }
            }
        }
        if(result[0]>result[1]){
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
