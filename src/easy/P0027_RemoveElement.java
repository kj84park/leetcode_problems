package easy;

public class P0027_RemoveElement {
    public static void main(String[] args) throws Exception {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
