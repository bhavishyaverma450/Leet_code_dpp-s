/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode *a=headA;
        ListNode *b = headB;
        // int count=0;
        while(a!=b){
            a = (a==nullptr)? headB:a->next;
            b = (b==nullptr)?headA:b->next;
        }
        // cout<<count;
        return a;
    }
};