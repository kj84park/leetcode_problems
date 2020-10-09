package medium;

import java.util.ArrayList;
import java.util.List;

public class P0120_Triangle_00 {
    public static void main(String[] args) throws Exception {

        List<List<Integer>> retList = new ArrayList<>();
        List<Integer> list01 = new ArrayList<>();
        list01.add(2);
        List<Integer> list02 = new ArrayList<>();
        list02.add(3);
        list02.add(4);
        List<Integer> list03 = new ArrayList<>();
        list03.add(6);
        list03.add(5);
        list03.add(7);
        List<Integer> list04 = new ArrayList<>();
        list04.add(4);
        list04.add(1);
        list04.add(8);
        list04.add(3);

        retList.add(list01);
        retList.add(list02);
        retList.add(list03);
        retList.add(list04);

        System.out.println(minimumTotal(retList));
    }
    public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0){
            return 0;
        }
        if(triangle.size() == 1){
            return triangle.get(0).get(0);
        }

        int[] dp = new int[triangle.size()+1];
        for(int i = triangle.size()-1 ; i >=0 ; i--){
            for(int j = 0 ; j < triangle.get(i).size() ; j++){
                int p = Math.min(dp[j] , dp[j+1]) + triangle.get(i).get(j);
                //System.out.println("j("+j+")"+" dp[j] : "+dp[j]+" dp[j+1] : "+dp[j+1]+ " + "+triangle.get(i).get(j)+" = "+p);
                dp[j] = p;
            }
        }
        return dp[0];
    }
}
