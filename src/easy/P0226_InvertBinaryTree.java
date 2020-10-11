package easy;

public class P0226_InvertBinaryTree {
    public static void main(String[] args) throws Exception {
//        TreeNode n1 = new TreeNode(4);
//        n1.left = new TreeNode(2);
//        n1.right = new TreeNode(7);
//        n1.left.left = new TreeNode(1);
//        n1.left.right = new TreeNode(3);
//        n1.right.left = new TreeNode(6);
//        n1.right.right = new TreeNode(9);
//        System.out.println(invertTree(n1));
        TreeNode n1 = new TreeNode(1);
        n1.left = new TreeNode(2);
        System.out.println(invertTree(n1));
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode head = root;
        invert(head);
        return root;
    }

    public static void invert(TreeNode node) {
        if (node == null || (node.right == null && node.left == null)) {
            return;
        }
        TreeNode tmp = node.right;
        node.right = node.left;
        node.left = tmp;
        invert(node.left);
        invert(node.right);
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
