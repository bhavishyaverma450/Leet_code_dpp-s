class MyHashSet {
    int n=10000;
    List<Integer>[] arr;

    public MyHashSet() {
        arr=new ArrayList[n];
        for(int i=0;i<n;i++){
            arr[i]=new ArrayList<>();
        }
    }
    
    public void add(int key) {
        int ind = key%n;
        if(!arr[ind].contains(key)){
            arr[ind].add(key);
        }
    }
    
    public void remove(int key) {
        int ind= key%n;
        arr[ind].remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        int ind = key%n;
        return arr[ind].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */