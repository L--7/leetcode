import java.util.Random;

public class GetRandom_382 {

    ListNode head;
    Random random;
    public GetRandom_382(ListNode head) {
        this.head = head;
        random = new Random();
    }

    public int getRandom() {
        int k = 1;
        int ans = head.val;
        ListNode cur = head;
        while (cur != null) {
            if (random.nextInt(k) == 0) {
                ans = cur.val;
            }
            cur = cur.next;
            k++;
        }
        return ans;
    }
}
