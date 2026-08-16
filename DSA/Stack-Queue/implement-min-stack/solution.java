class MinStack {
    private Stack<Long> st;
    private long mini;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty()) {
            mini = val;
            st.push((long) val);
            return;
        }

        if (val > mini) {
            st.push((long) val);
        } else {
            st.push(2L * val - mini);
            mini = val;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();

        if (x < mini) {
            mini = 2L * mini - x;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();

        if (x < mini) {
            return (int) mini;
        }

        return (int) x;
    }

    public int getMin() {
        return (int) mini;
    }
}