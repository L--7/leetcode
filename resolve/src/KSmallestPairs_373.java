import java.util.ArrayList;
import java.util.List;

public class KSmallestPairs_373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (ans.size() < k && (i < nums1.length || j < nums2.length)) {
            List<Integer> subAns = new ArrayList<>();
            subAns.add(nums1[i]);
            subAns.add(nums2[j]);
        }
        return ans;
    }
}
