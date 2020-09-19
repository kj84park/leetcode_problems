package medium;

import java.util.Arrays;

public class P0016_3SumClosest {
    public static void main(String[] args) throws Exception {
        System.out.println(threeSumClosest(new int[]{0,2,1,-3},1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ret = nums[0]+nums[1]+nums[nums.length-1];

        for (int i = 0 ; i < nums.length; i++){
            int left = i+1 ,right = nums.length-1;
                while(left < right){
                    int sum = nums[i]+nums[left]+nums[right];
                    if(sum == target){
                        return target;
                    } else if(sum < target) {
                        left++;
                        if(Math.abs(target-sum) < Math.abs(ret-target)){
                            ret = sum;
                        }
                    } else {
                        right--;
                        if(Math.abs(target-sum) < Math.abs(ret-target)){
                            ret = sum;
                        }
                    }
                }
        }
        return  ret;
    }
}
