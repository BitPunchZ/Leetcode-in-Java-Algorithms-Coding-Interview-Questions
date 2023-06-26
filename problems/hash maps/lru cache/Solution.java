class LRUCache {
    Deque<Integer> deq;
    HashMap<Integer,Integer> m;
    int c = 0;
    public LRUCache(int capacity) {
        deq=new LinkedList<Integer>();
        m = new HashMap<Integer, Integer>();
        c = capacity;
    }
    
    public int get(int key) {
        if(!m.containsKey(key))return -1;
        //if element is found, add it to the front of the list
        deq.remove(key);
        deq.addFirst(key);
        return m.get(key);
    }
    
    public void put(int key, int value) {
        if((!m.containsKey(key))&&((deq.size()==c))){ //key is not present in map
            //we need to remove the back element of the list
                int last = deq.getLast();
                m.remove(last);
                deq.pollLast(); 
        }else{ //key is present in the map
            deq.remove(key);
        }
        m.put(key, value);
        deq.addFirst(key);
        return;
        
     }

}