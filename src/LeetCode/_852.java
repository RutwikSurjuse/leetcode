package LeetCode;

public class _852 {
    static int binarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;
            else {
                ans = mid;
                break;
            }
        }
        return ans;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(mid!=0 && mid!=arr.length-1) {
                if (arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid]) { // find after
                    start = mid + 1;
                } else if (arr[mid - 1] > arr[mid] && arr[mid + 1] < arr[mid]) { // find before
                    end = mid - 1;
                } else {
                    ans = mid;
                    break;
                }
            }
            else {
                if(arr[1]==Math.max(arr[1], arr[arr.length-2])) ans = 1;
                else ans = arr.length-2;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
