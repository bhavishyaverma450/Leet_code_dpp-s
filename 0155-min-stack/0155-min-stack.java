class MinStack {
    class Node{
        int data;
        int min;
        Node next;
        Node(int data,int min){
            this.data=data;
            this.min=min;
            this.next=null;
        }
    }
    Node head;
    public void push(int val) {
        if(head==null){
            head=new Node(val,val);
        }else{
            Node temp=new Node(val,Math.min(val,head.min));
            temp.next=head;
            head=temp;
        }
    }
    
    public void pop() {
        if(head==null){
            System.out.println("Stack is empty");
            return;
        }
        head=head.next;
    }
    
    public int top() {
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    
    public int getMin() {
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */