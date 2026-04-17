/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tA=headA;
        ListNode tB=headB;
        while(tA!=tB){
            if(tA==null){
                tA=headB;
            }else{
                tA=tA.next;
            }
            if(tB==null){
                tB=headA;
            }else{
                tB=tB.next;
            }
        }
        return tA==tB?tA:null;
    }
}