package medium;

public class P0033_SearchInRotatedSortedArray_00 {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(nums, 0));
    }

    public static int search(int[] nums, int target) {
        int hi = nums.length - 1;
        int lo = 0;

        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (nums[hi] > nums[mid]) {
                if (nums[mid] < target && nums[hi] >= target) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                if (nums[mid] > target && nums[lo] <= target) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }

        return -1;
    }
}
