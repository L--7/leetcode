public class ListNode {
    int key;
    int val;
    ListNode next;
    ListNode pre;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int key, int val) { this.val = val; this.key = key;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}