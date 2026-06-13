class MinStack {

    private int[] stack;
    private int[] min;

    int idx = 0;
    int minidx = 0;

    int curmin = Integer.MAX_VALUE;

    public MinStack() {
        stack = new int[1000];
        min = new int[1000];
    }

    public void push(int val) {

        stack[idx] = val;

        if (val <= curmin) {   // <= handles duplicates
            curmin = val;
            min[minidx] = idx;
            minidx++;
        }

        idx++;
    }

    public void pop() {

        if (idx == 0) {
            return;
        }

        idx--;

        // Check if popped element was current minimum
        if (minidx > 0 && idx == min[minidx - 1]) {

            minidx--;

            if (minidx == 0) {
                curmin = Integer.MAX_VALUE;
            } else {
                curmin = stack[min[minidx - 1]];
            }
        }
    }

    public int top() {
        return stack[idx - 1];
    }

    public int getMin() {
        return curmin;
    }
}