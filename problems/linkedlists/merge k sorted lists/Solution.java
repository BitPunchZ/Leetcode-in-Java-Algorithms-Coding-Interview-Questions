/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /* 
      [
        1 => 2 => 3 => 4 
        
        9 => 10 => 11 => 12 
      ]
    */
  
    public ListNode merge2Lists(ListNode l1, ListNode l2){
      ListNode cur = new ListNode(0);
      ListNode ans = cur;
  
      while(l1 != null && l2 != null){
        if(l1.val > l2.val){
          cur.next = l2;
          l2 = l2.next;
        }
        else{
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
  
    public ListNode mergeKLists(ListNode[] lists) {
     if(lists.length == 0){
       return null;
     }   
  
     int i = 0;
     int last = lists.length-1;
     int j = last;
  
     while(last != 0){
      i = 0;
      j = last;
      while(j>i){
        lists[i] = merge2Lists(lists[i], lists[j]);
        i++;
        j--;
  
        last = j;
      }
     }
     return lists[0];
    }
  }