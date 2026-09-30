class HitCounter {
    private Queue<Integer> hits; 
    
    public HitCounter() {
        hits = new LinkedList<>();
    }
    public void hit(int timestamp) {
        hits.add(timestamp); 
    }
    public int getHits(int timestamp) {
        while (!hits.isEmpty()) {
            int diff = timestamp - hits.peek(); 
            
            if (diff >= 300) hits.poll(); 
            else break; 
        }
        return hits.size(); 
    }
}

