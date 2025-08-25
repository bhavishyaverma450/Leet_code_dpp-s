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
        
        if(head==null) return head;
        if(head.next==null) return head=null;
        
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        int mid = length/2;
        temp=head;
        ListNode prev = null;
        int count=0;
        while(count!=mid){
            prev =temp;
            temp = temp.next;
            count++;
        }
        prev.next = temp.next;
        
        return head;
    }
}