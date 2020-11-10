/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while (head != null) {
            ListNode nxt = head.next;
            head.next = node;
            node = head;
            head = nxt;
        }
        return node;
    }
}
