


class MyQueue {

    /** Initialize your data structure here. */
    
    Stack<Integer> stk;
    Stack<Integer> sq;
    int front=0;
    public MyQueue() {
        stk = new Stack<Integer>();
        sq = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stk.isEmpty())
            front = x;
        stk.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(sq.isEmpty())
        {
            while(!stk.isEmpty())
            {
                sq.push(stk.pop());
            }
            return sq.pop();
        }
        else{
            return sq.pop();
        }
    }
    
    /** Get the front element. */
    public int peek() {
        if(!sq.isEmpty())
        {
            return sq.peek();
        }
        
        return front;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stk.isEmpty() && sq.isEmpty();
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
