package medium;

import java.util.Arrays;

public class P0031_NextPermutation_00 {
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{1,5,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1 ){
            return;
        }
        int i = nums.length-2;
        while (i >= 0 && (nums[i] >= nums[i+1])){
            i--;
        }
        if(i>=0){
            int j = nums.length-1;
            while(nums[i] >= nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }

    public static void swap(int num[], int i , int j){
        int tmp = num[i];
        num[i] = num[j];
        num[j] = tmp;
    }

    public static void reverse(int num[], int i , int j){
        while(i < j) swap(num,i++,j--);
    }
}
