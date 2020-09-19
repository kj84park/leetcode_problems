package medium;

public class P0011_ContainerWithMostWater {
    public static void main(String[] args) throws Exception {

        int [] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
    public static int maxArea(int[] height) {
        int max = 0;

        for (int i = 0 ; i < height.length ; i++){
            for (int j = i ; j < height.length ; j++){
                int wallHeight = Math.min(height[i],height[j]);
                max = Math.max(max, wallHeight * Math.abs(i-j));
            }
        }
        return max;
    }
}
