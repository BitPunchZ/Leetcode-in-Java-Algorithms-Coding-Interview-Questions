
class MinStack {
    Deque<Pair>st;
    /** initialize your data structure here. */
    public MinStack() {
        st = new ArrayDeque<>();
    }
    
    public void push(int x) {
        Pair p = new Pair();
        p.val = x;
        int prevMin = !st.isEmpty()?st.getLast().min:Integer.MAX_VALUE;
        p.min = Math.min(p.val, prevMin);
        st.addLast(p);
    }
    
    public void pop() {
        st.removeLast();
    }
    
    public int top() {
        return st.getLast().val;
    }
    
    public int getMin() {
      return st.getLast().min;
    }
}

class Pair{
    int val;
    int min;
}