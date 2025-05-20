/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
       if(!head || !head->next){
            return true;
       }
       struct ListNode *slow=head;
       struct ListNode *fast=head;
       while(fast->next && fast->next->next){
            slow=slow->next;
            fast=fast->next->next;
       }
       struct ListNode *prev=nullptr;
       struct ListNode *curr = slow->next;
       while(curr){
            struct ListNode *temp = curr->next;
            curr->next=prev;
            prev=curr;
            curr=temp;
       }
       struct ListNode *firstHalf = head;
       struct ListNode *secondHalf = prev;
       while(secondHalf){
            if(firstHalf->val!=secondHalf->val){
                return false;
            }
            firstHalf=firstHalf->next;
            secondHalf=secondHalf->next;
       }
       return true;
    }
};