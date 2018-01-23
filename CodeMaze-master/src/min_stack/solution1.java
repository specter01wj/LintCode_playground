class MinStack {
    
    private Node first;
    
    private class Node {
        int val;
        int min;
        Node next;
    }
    
    private boolean isEmpty() {
        return first == null;
    }

    /** initialize your data structure here. */
    public MinStack() {
        first = null;
    }
    
    public void push(int x) {
        Node head = new Node();
        head.val = x;
        if (isEmpty()) {
            head.min = x;
        } else {
            head.min = x < first.min ? x : first.min;
        }
        head.next = first;
        first = head;
    }
    
    public void pop() {
        if (!isEmpty()) {
            first = first.next;
        }
    }
    
    public int top() {
        if (!isEmpty()) {
            return first.val;
        } else {
            return Integer.MAX_VALUE;
        }
    }
    
    public int getMin() {
        if (!isEmpty()) {
            return first.min;
        } else {
            return Integer.MAX_VALUE;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */