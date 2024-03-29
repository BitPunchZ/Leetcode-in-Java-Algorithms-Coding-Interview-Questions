
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    /*
      l1: 1 => 2 => 3
      l2: 2 => 3 => 4
      output: 0=>1=>2=>2=>3=>3=>4
    */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = new ListNode(0);
        ListNode ans = new ListNode(0);
        ans = cur;
  
        while(l1 != null && l2 != null){
          if(l1.val > l2.val){
            cur.next = l2;
            l2 = l2.next;
          }else{
            cur.next = l1;
            l1 = l1.next;
          }
          cur = cur.next;
        }
  
  
        while(l1 != null){
          cur.next = l1;
          l1 = l1.next;
          cur = cur.next;
        }
  
        while(l2 != null){
          cur.next = l2;
          l2 = l2.next;
          cur = cur.next;
        }
  
        return ans.next;
    }
  }