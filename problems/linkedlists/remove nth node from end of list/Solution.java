/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = new ListNode(0);
        ans.next = head;
        ListNode first = ans;
        ListNode second = ans;

        for(int i=1;i<=n+1;++i){
          first = first.next;
        }

        while(first!=null){
          first = first.next;
          second = second.next;
        }
        second.next = second.next.next;
        return ans.next;

    }
}