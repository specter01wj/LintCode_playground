class MyStack {

    private Queue<Integer> in;
    private Queue<Integer> out;
    private int size;
    /** Initialize your data structure here. */
    public MyStack() {
        in = new LinkedList<>();
        out = new LinkedList<>();
        size = 0;
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        in.offer(x);
        size++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i = 0; i < size - 1; ++i) {
            out.offer(in.poll());
        }
        int res = in.peek();
        in.poll();
        size--;
        in = out;
        out = new LinkedList<>();
        
        return res;
    }
    
    /** Get the top element. */
    public int top() {
        for (int i = 0; i < size - 1; ++i) {
            out.offer(in.poll());
        }
        int res = in.peek();
        out.offer(in.poll());
        in = out;
        out = new LinkedList<>();
        
        return res;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return size == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */