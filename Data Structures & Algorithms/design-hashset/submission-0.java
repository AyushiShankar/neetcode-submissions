class MyHashSet {
    private static final int capacity = 10007;
    private final LinkedList<Integer>[] bucket;

    public MyHashSet() {
        bucket = new LinkedList[capacity];
    }
    public int hash(int key) {
        return key % capacity;
    }

    public void add(int key) {
        int index = hash(key);
        if(bucket[index] == null){
           bucket[index] = new LinkedList<>(); 
        }
       if(!bucket[index].contains(key)){
        bucket[index].add(key);
       }
    }

    public void remove(int key) {
         int index = hash(key);
         if(bucket[index] != null){
            bucket[index].remove(Integer.valueOf(key));
         }
    }

    public boolean contains(int key) {
             int index = hash(key);
              return bucket[index] != null
                && bucket[index].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */