// Last updated: 3/28/2025, 1:39:44 PM
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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode ptr1=head;
        ListNode ptr2=head.next;
        ListNode newHead=head.next;;
        ListNode prev=null;
        
        while(ptr1!=null && ptr2!=null) {
            ListNode temp = ptr2.next;
            ptr1.next = temp;
            ptr2.next = ptr1;
            
            if(prev!=null) {
                prev.next=ptr2;
            }
            
            prev = ptr1;
            ptr1 = temp;
            ptr2 = (ptr1 != null) ? ptr1.next : null;  
        }
        
        return newHead;
    }
}