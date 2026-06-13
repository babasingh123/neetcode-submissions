class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> st = new ArrayDeque<>();

        for (String token : tokens) {

            if (token.equals("+")) {
                st.push(st.pop() + st.pop());

            } else if (token.equals("-")) {
                int right = st.pop();
                int left = st.pop();
                st.push(left - right);

            } else if (token.equals("*")) {
                st.push(st.pop() * st.pop());

            } else if (token.equals("/")) {
                int right = st.pop();
                int left = st.pop();
                st.push(left / right);

            } else {
                st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}