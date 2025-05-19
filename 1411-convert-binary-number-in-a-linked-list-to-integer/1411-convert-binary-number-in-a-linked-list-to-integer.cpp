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
    int getDecimalValue(ListNode* head) {
        int arr[30]={0};
        struct ListNode *temp=head;
        int i=0;
        int count=0;
        int num=0;
        while(temp){
            arr[i]=temp->val;
            i++;
            temp = temp->next;
            count++;
        }
        i=0;
        int stat=count;
        while(i<stat){
            num = num+(arr[i]*pow(2,count-1));
            i++;
            count--;
        }
        
        return num;
    }
};