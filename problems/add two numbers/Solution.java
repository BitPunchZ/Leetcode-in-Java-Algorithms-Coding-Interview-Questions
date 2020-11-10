/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode pointer = ans;
        int carry = 0;
        int sum = 0;
        while(l1!=null || l2!=null){
            sum = carry;
            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            
            pointer.next = new ListNode(sum%10);
            
            pointer = pointer.next;
        }   
        if(carry>0){
            pointer.next = new ListNode(carry);
        }
        return ans.next;
    }
}