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
    public void reorderList(ListNode head) {
        //ListNode dummy = new ListNode(0);
        //ListNode prev = dummy;
        ListNode current = head;
        ListNode store;
        ListNode pos = head;
        
        while(current != null){
            if(current.next != null){
                if(current.next.next == null){
                    store = current.next;
                    current.next = null;
                    store.next = pos.next;
                    pos.next = store;
                    pos = pos.next.next;
                    current = pos;
                    continue;
                }
                current = current.next;
            }else{
                break;
            }
        }    

    }
}
