public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode hare = head, turtle = head;
        while(turtle!=null && hare!=null && hare.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
            if(turtle==hare)return true;
        }
        return false;

    }
}