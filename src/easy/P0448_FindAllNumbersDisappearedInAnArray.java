package easy;

import java.util.ArrayList;
import java.util.List;

public class P0448_FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) throws Exception {
        System.out.println(findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            while (val != nums[val - 1]) {
                //System.out.println(" val : "+val+" i : "+i+" [val-1] : "+nums[val-1]);
                int tmp = nums[val - 1];
                nums[val - 1] = val;
                val = tmp;

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ret.add(i + 1);
            }
        }
        return ret;
    }
}
