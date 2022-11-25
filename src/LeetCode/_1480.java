package LeetCode;

import java.util.Arrays;

public class _1480 {
    public static int[] runningSum(int[] nums) {
        int [] result = new int [nums.length];
        for(int i = 0; i<nums.length; i++){
            if(i!=0){
                result [i] = result [i-1] + nums[i];
            }
            else result [i] =  nums [i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.print(Arrays.toString(runningSum(nums)));
    }
}