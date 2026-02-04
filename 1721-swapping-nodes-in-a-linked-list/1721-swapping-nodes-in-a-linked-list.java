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
    public ListNode swapNodes(ListNode head, int k) {
        int length=0;
        ListNode temp1=head;
        while(temp1!=null){
            temp1=temp1.next;
            length++;
        }
        temp1=head;
        ListNode temp2=head;
        int count=0;
        while(temp1!=null && count<k-1){
            temp1=temp1.next;
            count++;
        }
        count=0;
        while(temp2!=null && count<length-k){
            temp2=temp2.next;
            count++;
        }
        int temp = temp1.val;
        temp1.val=temp2.val;
        temp2.val=temp;

        return head;
    }
}