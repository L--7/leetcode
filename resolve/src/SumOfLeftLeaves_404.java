

public class SumOfLeftLeaves_404 {


    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null && isLeaf(root.left)) {
            sum += root.left.val;
        } else {
            sum += sumOfLeftLeaves(root.left);
        }
        sum += sumOfLeftLeaves(root.right);
        return sum;
    }

    boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
