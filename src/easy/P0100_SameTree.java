package easy;

public class P0100_SameTree {
    public static void main(String[] args) throws Exception {
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(2);
//        node1.right = new TreeNode(3);

        TreeNode node2 = new TreeNode(1);
//        node2.left = new TreeNode(2);
        node2.right = new TreeNode(2);

        System.out.println(isSameTree(node1,node2));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
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
