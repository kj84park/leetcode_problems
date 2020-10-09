package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0448_FindAllNumbersDisappearedInAnArray_XX {
    public static void main(String[] args) throws Exception {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }

        List<Integer> ret = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if( i != 0 && nums[i] != nums[i-1] && nums[i] != nums[i-1]+1 ){
                ret.add(i);
            }
        }
        return ret;
    }
}
