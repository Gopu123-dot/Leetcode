class MyStack {
    Stack <Integer> st;
    Queue <Integer> q1;
    Queue <Integer> q2;
    public MyStack() {
        st=new Stack<>();
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    
    public void push(int x) {
        q1.offer(x);
        q2.offer(q1.poll());
        st.push(x);
        q1.offer(q2.poll());
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
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