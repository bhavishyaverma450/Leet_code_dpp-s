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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head.next==null) return head=null;
        if(head==null) return head;

        int length=0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        if(n>length) return head;
        if(n==length) return head.next;

        int m = length-n;

        temp = head;
        ListNode prev = null;
        int count=1;
        while(count!=m+1){
            count++;
            prev = temp;
            temp=temp.next;
        }
        prev.next = temp.next;
        return head;
    }
}