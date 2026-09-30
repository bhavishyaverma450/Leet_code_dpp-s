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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode temp=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow.next==null)temp.next=null;
        temp.next=slow.next;
        return head;
    }
}