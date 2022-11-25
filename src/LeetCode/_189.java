package LeetCode;

import java.util.Arrays;

public class _189 {
    public static void rotate(int[] nums, int k) {
        while(nums.length < k) k -= nums.length;
        for(int i = 0; i < k; i++){
            int temp = 0;
            for(int j = nums.length-1; j >=0; j--){
                if(j==nums.length-1) {
                    temp = nums[nums.length-1];
                    continue;
                }
                nums[j+1] = nums[j];
                if(j==0) nums[0] = temp;
            }
        }
        System.out.print(Arrays.toString(nums));
    }
    public static void main (String [] args){
        int [] nums = {};
        int k = 0;
        rotate(nums, k);
    }
}