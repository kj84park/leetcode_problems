package easy;

public class P0303_RangeSumQuery_Immutable {
    public static void main(String[] args) throws Exception {
        NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int param_1 = obj.sumRange(2, 5);
        System.out.println(param_1);
    }

    static class NumArray {
        int[] partialSum;

        public NumArray(int[] nums) {
            if(nums == null || nums.length == 0){

            } else {

                partialSum = new int[nums.length];
                partialSum[0] = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    partialSum[i] = partialSum[i - 1] + nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {
            if(i == 0){
                return partialSum[j];
            }
            return partialSum[j] - partialSum[i-1];
        }
    }
}


