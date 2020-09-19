package easy;

public class P0026_RemoveDuplicateFromSortedArray {

    public static void main(String[] args) throws Exception {
        System.out.println(removeDuplicates(new int[]{1,1}));
    }

    public static int removeDuplicates(int[] nums) {
        int length = 1;

        for (int i = 1 ; i < nums.length ; i++){
            if(nums[i] == nums[i-1]) {
                continue;
            } else {
                nums[length] = nums[i];
                length++;
            }
        }

        return length;
    }
}
