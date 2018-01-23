class LRUCache {

    private class Node {
        public int key;
        public int value;
        public Node next;
        public Node prev;
        public Node(int k, int v) {
            key = k;
            value = v;
            next = null;
            prev = null;
        }
    }
    
    private int cap;
    private int size;
    private Map<Integer, Node> map;
    private Node head;
    private Node tail;
    
    public LRUCache(int capacity) {
        map = new HashMap<>();
        cap = capacity;
        size = 0;
        head = null;
        tail = null;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            insertToHead(node);
            return node.value;
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node node;
        if (map.containsKey(key)) {
            node = map.get(key);
            node.value = value;
        } else {
            node = new Node(key, value);
        }
        insertToHead(node);
    }
    
    private void insertToHead(Node node) {
        if (map.containsKey(node.key)) {
            if (node.key == head.key) {
                // nothing change
            } else {
                if (node.key == tail.key && size > 1) {
                    tail.prev.next = null;
                    map.put(tail.prev.key, tail.prev);
                
                    tail = tail.prev;
                }
                if (node.prev != null) {
                    node.prev.next = node.next;
                    map.put(node.prev.key, node.prev);
                }
                
                if (node.next != null) {
                    node.next.prev = node.prev;
                    map.put(node.next.key, node.next);
                }
                
                head.prev = node;
                map.put(head.key, head);
                
                node.prev = null;
                node.next = head;
                head = node;
            }
        } else {
            if (size == 0) {
                head = node;
                tail = node;
            } else {
                head.prev = node;
                map.put(head.key, head);
                
                node.next = head;
                head = node;
            }
            if (size + 1 > cap) {
                tail.prev.next = null;
                map.put(tail.prev.key, tail.prev);
                
                map.remove(tail.key);
                tail = tail.prev;
            } else {
                ++size;
            }
        }
        map.put(node.key, node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */