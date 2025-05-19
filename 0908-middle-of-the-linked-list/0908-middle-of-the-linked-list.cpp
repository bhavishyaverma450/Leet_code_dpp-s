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
    ListNode* middleNode(ListNode* head) {
        int count=0;
        struct ListNode *temp=head;
        while(temp){
            count++;
            temp=temp->next;
        }
        int res=1;
        int mid = (count/2)+1;
        
        temp=head;
        while(res!=mid){
            temp=temp->next;
            res++;
        }
    return temp;
    }
};