class MyQueue {

    private Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> tmp_stack = new Stack<>();
        while (!stack.isEmpty()) {
            tmp_stack.push(stack.pop());
        }
        tmp_stack.push(x);
        while (!tmp_stack.isEmpty()) {
            stack.push(tmp_stack.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       return stack.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */