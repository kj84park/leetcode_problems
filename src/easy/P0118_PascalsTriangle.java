package easy;

import java.util.ArrayList;
import java.util.List;

public class P0118_PascalsTriangle {
    public static void main(String[] args) throws Exception {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows < 1) {
            return list;
        }

        for (int i = 0; i < numRows; i++) {
            List childList = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    childList.add(1);
                } else {
                    childList.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            }
            list.add(childList);
        }
        return list;
    }
}
