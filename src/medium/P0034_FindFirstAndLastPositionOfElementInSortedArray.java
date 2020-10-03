package medium;

import java.util.Arrays;

public class P0034_FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 7)));
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    public static int findFirst(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
            }
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return index;
    }

    public static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
            }

            if (nums[mid] <= target) {//오른쪽
                start = mid + 1;
            } else {//왼쪽
                end = mid - 1;
            }
        }
        return index;
    }
}
