import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P1015_3Sum {

    public static void main(String[] args) throws Exception {

        System.out.println(threeSum(new int[]{0,0,0,0}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> retList = new ArrayList<>();
        if (nums.length < 3) {
            return retList;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    retList.add(list);
//                    while( left < right && nums[right] == nums[right-1]){
//                        right--;
//                    }
//                    while(left < right && nums[left] == nums[left+1]){
//                        left++;
//                    }
                    left++;
                    right--;
                } else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }

        retList = retList.stream().distinct().collect(Collectors.toList());
        return retList;
    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//
//        List<List<Integer>> retList = new ArrayList<>();
//
//
//        if(nums.length < 3){
//            return retList;
//        }
//
//        Arrays.sort(nums);
//
//        for (int i = 0 ; i < nums.length ; i++){
//
//            if(nums[i] > 0){
//                break;
//            }
//            for (int j = i+1 ; j <  nums.length; j++ ){
//
//                if(nums[i]+nums[j] > 0){
//                    break;
//                }
//                for (int k = j+1; k < nums.length; k++){
//                    if(nums[i]+nums[j]+nums[k] > 0){
//                        break;
//                    }
//
//                  if(nums[i]+nums[j]+nums[k] == 0){
//                      List<Integer> list = new ArrayList<>();
//                      list.add(nums[i]);
//                      list.add(nums[j]);
//                      list.add(nums[k]);
//                      retList.add(list);
//                  }
//                }
//            }
//        }
//
//        retList = retList.stream().distinct().collect(Collectors.toList());
//        return retList;
//    }

}
