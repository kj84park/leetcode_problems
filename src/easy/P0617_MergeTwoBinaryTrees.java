package easy;

public class P0617_MergeTwoBinaryTrees {
    public static void main(String[] args) throws Exception {
        TreeNode node01 = new TreeNode(1);
        node01.left = new TreeNode(3);
        node01.right = new TreeNode(2);
        node01.left.left = new TreeNode(5);

        TreeNode node02 = new TreeNode(2);
        node02.left = new TreeNode(1);
        node02.right = new TreeNode(3);
        node02.left.right = new TreeNode(4);
        node02.right.right = new TreeNode(7);

        System.out.println(mergeTrees(node01, node02));
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }

        TreeNode node = new TreeNode(t1.val + t2.val);
        node.left = mergeTrees(t1.left,t2.left);
        node.right = mergeTrees(t1.right,t2.right);
        return node;
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}
