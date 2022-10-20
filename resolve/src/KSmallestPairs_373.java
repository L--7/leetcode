import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KSmallestPairs_373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return nums1[o1[0]] + nums2[o1[1]] - nums1[o2[0]] - nums2[o2[1]];
            }
        });
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            priorityQueue.add(new int[]{i, 0});
        }
        while (ans.size() < k && !priorityQueue.isEmpty()){
            int []min = priorityQueue.poll();
            List<Integer> subAns = new ArrayList<>();
            subAns.add(nums1[min[0]]);
            subAns.add(nums2[min[1]]);
            ans.add(subAns);
            if (min[1] + 1 >= nums2.length) {
                continue;
            }
            priorityQueue.add(new int[]{min[0], min[1] + 1});
        }
        return ans;
    }
}
