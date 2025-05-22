class Node{
    int key;
    int value;
    Node next;
    Node prev;

    public Node(int key,int value){
        this.key=key;
        this.value=value;
        next=null;
        prev=null;
    }
}

class LRUCache {
    private int cap;
    private Map<Integer,Node>cache;
    private Node oldest;
    private Node latest;

    public LRUCache(int capacity) {
        this.cap=capacity;
        this.cache = new HashMap<>();
        this.oldest=new Node(0,0);
        this.latest = new Node(0,0);
        this.oldest.next = this.latest;
        this.latest.prev= this.oldest;
    }
    private void remove(Node node){
        Node prev= node.prev;
        Node next = node.next;
        prev.next=next;
        next.prev=prev;
    }
    private void insert(Node node){
        Node prev=latest.prev;
        Node next = latest;
        prev.next=next.prev=node;
        node.next=next;
        node.prev=prev;
    }
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            remove(cache.get(key));
        }
        Node newNode = new Node(key,value);
        cache.put(key,newNode);
        insert(newNode);

        if(cache.size()>cap){
            Node lru = oldest.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */