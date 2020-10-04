package medium;

public class P0153_FindMinimumInRotatedSortedArray {
    public static void main(String[] args) throws Exception {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return nums[start];
    }
}
