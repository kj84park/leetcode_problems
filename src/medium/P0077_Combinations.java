package medium;

import java.util.ArrayList;
import java.util.List;

public class P0077_Combinations {
    public static void main(String[] args) throws Exception {
        System.out.println(combine(4, 2));
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        combination(n, k, list, new ArrayList<>(), 1);
        return list;
    }

    public static void combination(int n, int k, List<List<Integer>> list, List<Integer> path, int start) {
        if (path.size() == k) {
            list.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n; i++) {
            path.add(i);
            combination(n, k, list, path, i + 1);
//            System.out.println(path);
            path.remove(path.size() - 1);
        }
    }
}
