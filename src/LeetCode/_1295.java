package LeetCode;

public class _1295 {
    public static int findNumbers2(int[] nums) {
        int count = 0;
        for(int target : nums) if(Integer.toString(target).toCharArray().length%2==0) count++;
        return count;
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int target : nums) if((int) (Math.log10(target)+1)%2==0) count++;
        return count;
    }
    public static void main(String[] args) {
        int [] nums = {};
        System.out.println(findNumbers(nums));
    }
}
