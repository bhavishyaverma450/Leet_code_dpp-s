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
    public ListNode reverseKGroup(ListNode head, int k) {
        head = reverseKGroup(head,null,k);
        return head;
    }
    public ListNode reverseKGroup(ListNode head,ListNode prev,int k){
        if(head==null)return null;
        int count=0;
        ListNode temp=head;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        if(count<k)return head;

        ListNode curr=head;
        ListNode groupTail=head;
        count=0;
        while(curr!=null && count<k){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(curr!=null){
            groupTail.next=reverseKGroup(curr,null,k);
        }
        return prev;
    }
}