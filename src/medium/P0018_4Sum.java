package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P0018_4Sum {
    public static void main(String[] args) throws Exception {
        System.out.println(fourSum(new int[]{1, 0, -1, 0, -2, 2},0));
    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0 ; i < nums.length-3; i++){
            for (int j = i+1 ; j < nums.length-2; j++ ){
                int left = j+1, right = nums.length-1;
                while(left < right){
                    if(nums[i]+nums[j]+nums[left]+nums[right] == target){
                        List<Integer> lst = new ArrayList<>();
                        lst.add(nums[i]);
                        lst.add(nums[j]);
                        lst.add(nums[left]);
                        lst.add(nums[right]);
                        list.add(lst);
                        left++;
                        right--;
                        while((left < right) && nums[left] == nums[left-1]) left++;
                        while((left < right) && nums[right] == nums[right+1]) right--;

                    } else if(nums[i]+nums[j]+nums[left]+nums[right] > target){
                        right--;
                        while((left < right) && nums[right] == nums[right+1]) right--;
                    } else {
                        left++;
                        while((left < right) && nums[left] == nums[left-1]) left++;
                    }
                }
                while (j+1 < nums.length && nums[j+1] == nums[j])
                    j++;
            }
            while (i+1 < nums.length && nums[i+1] == nums[i])
                i++;
        }

        return list;
    }
}
