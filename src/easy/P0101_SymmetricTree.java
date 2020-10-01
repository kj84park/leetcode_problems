package easy;

public class P0101_SymmetricTree {
    public static void main(String[] args) throws Exception {
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
        node1.left.left = new TreeNode(3);
        node1.left.right = new TreeNode(4);
        node1.right = new TreeNode(2);
        node1.right.left = new TreeNode(4);
        node1.right.right = new TreeNode(3);
        System.out.println(isSymmetric(node1));
    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return false;
        }
        return isSymmetricTree(root.left, root.right);
    }

    public static boolean isSymmetricTree(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetricTree(left.left, right.right) && isSymmetricTree(left.right, right.left);
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
