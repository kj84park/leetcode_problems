package easy;

public class P0035_SearchInsertPosition {
    public static void main(String[] args) throws Exception {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return Math.max(i, 0);
            } j++;
        }
        return j;
    }
}
