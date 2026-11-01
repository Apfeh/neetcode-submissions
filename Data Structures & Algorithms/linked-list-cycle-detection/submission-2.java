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
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;

        while(fast != null){
             fast = fast.next;
            if(fast != null)
                fast = fast.next;
            else
                break;

            if(fast == head ){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
