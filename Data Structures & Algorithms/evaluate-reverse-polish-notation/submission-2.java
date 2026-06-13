class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> st = new ArrayDeque<>();

        for (String token : tokens) {

            switch (token) {

                case "+":
                    st.push(st.pop() + st.pop());
                    break;

                case "-": {
                    int right = st.pop();
                    int left = st.pop();
                    st.push(left - right);
                    break;
                }

                case "*":
                    st.push(st.pop() * st.pop());
                    break;

                case "/": {
                    int right = st.pop();
                    int left = st.pop();
                    st.push(left / right);
                    break;
                }

                default:
                    st.push(Integer.parseInt(token));
            }
        }

        return st.pop();
    }
}