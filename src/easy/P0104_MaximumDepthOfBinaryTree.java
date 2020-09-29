package easy;

import java.util.ArrayList;
import java.util.List;

public class P0104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) throws Exception {
        TreeNode node1 = new TreeNode(3);
        node1.left = new TreeNode(9);
        node1.right = new TreeNode(20);
        node1.right.right = new TreeNode(7);
        node1.right.left = new TreeNode(15);

        System.out.println(maxDepth(node1));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int depth = 0;
        List<Integer> max = new ArrayList<>();
        TreeNode node = root;
        dfs(1, root, max);
        return max.get(0);
    }

    public static void dfs(int depth, TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }
        System.out.println("depth : " + depth + " value : " + root.val);
        if (list.size() == 0) {
            list.add(depth);

        } else {
            int value = list.get(0);
            list.set(0, Math.max(depth, value));
        }
        depth = depth + 1;
        dfs(depth, root.left, list);
        dfs(depth, root.right, list);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
