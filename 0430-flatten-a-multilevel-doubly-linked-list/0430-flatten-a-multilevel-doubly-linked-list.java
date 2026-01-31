/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
                Node temp=curr.next;
                curr.next=curr.child;
                curr.child.prev=curr;
                Node last=findLastNode(curr.child);
                // if(temp!=null){
                    last.next=temp;
                    temp.prev=last;
                // }
                curr.child=null;
            }
            curr=curr.next;
        }
        return head;
    }
    public Node findLastNode(Node head){
        while(head.next!=null){
            head=head.next;
        }
        return head;
    }
}