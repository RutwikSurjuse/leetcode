package LeetCode;

public class _162 {
    public static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid != 0 && mid != nums.length - 1) {
                if (nums[mid - 1] < nums[mid] && nums[mid + 1] > nums[mid]) { // find after
                    start = mid + 1;
                } else if (nums[mid - 1] > nums[mid] && nums[mid + 1] < nums[mid]) { // find before
                    end = mid - 1;
                } else {
                    ans = mid;
                    break;
                }
            } else {
                if (nums[1] == Math.max(nums[1], nums[nums.length - 2])) ans = 1;
                else ans = nums.length - 2;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(findPeakElement(arr));
    }
}

