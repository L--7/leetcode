public class CountNodes_222 {

    public int countNodes(TreeNode root) {
        int level = 0;
        TreeNode cur = root;
        while (cur != null) {
            level++;
            cur = cur.left;
        }
System.out.println();
        int left = 1 << (level - 1), right = (1 << level) - 1;
        int ans = left;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (exist(root, mid, level)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    boolean exist(TreeNode root, int node, int level) {
        int deep = 1;
        int mask = 1 << (level - 1);
        TreeNode cur = root;
        while (cur != null) {
            deep++;
            if ((node & mask) > 0) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
            mask = mask >> 1;
        }
        return deep == level;
    }
}
