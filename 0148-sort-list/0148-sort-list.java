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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode mid = getMiddle(head);
        ListNode right = mid.next;
        mid.next=null;

        ListNode leftHalf = sortList(head);
        ListNode rightHalf = sortList(right);

        ListNode res = merge(leftHalf,rightHalf);

        return res;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1!=null) tail.next = l1;
        if(l2!=null) tail.next=l2;

        return dummy.next;
    }
    public ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}