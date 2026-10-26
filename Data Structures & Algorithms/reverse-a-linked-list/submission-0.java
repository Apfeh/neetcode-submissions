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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode node;
        if(head != null){
            node = new ListNode(head.val);  
        }else{
            return head;
        }
        
        current = current.next;
        while(current != null ){
            node = createNode(current.val, node); 
            current = current.next;    
        }

        return node;
    }
    public ListNode createNode(int val, ListNode node){
        ListNode nodes = new ListNode(val, node);

        return nodes;
    }
}
