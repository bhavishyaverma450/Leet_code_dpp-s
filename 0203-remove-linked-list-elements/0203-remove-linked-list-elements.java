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
    public ListNode removeElements(ListNode head, int val) {
        ListNode t=new ListNode(-1);
        t.next=head;
        ListNode prev=t;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val==val){
                ListNode temp=curr.next;
                prev.next=temp;
                curr=temp;
            }else{
                prev=curr;
                curr=curr.next;
            }
        }

        return t.next;
    }
}