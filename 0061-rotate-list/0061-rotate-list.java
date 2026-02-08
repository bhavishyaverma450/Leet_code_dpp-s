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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null)return head;
        int count=0;
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        k=k%length;
        while(count<k){
            ListNode lastPrev=null;
            ListNode last=head;
            while(last.next!=null){
                if(lastPrev==null)lastPrev=head;
                else lastPrev=lastPrev.next;
                last=last.next;
            }
            last.next=head;
            head=last;
            lastPrev.next=null;
            count++;
        }
        return head;
    }
}