class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<Integer>();

        for(int i = 0 ; i < tokens.length ; i++) {
            if(tokens[i].equals("+")) {
                int first = st.pop();
                int second = st.pop();
                st.push(first+second);
            }else if(tokens[i].equals("-")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second-first);
            }else if(tokens[i].equals("*")) {
                int first = st.pop();
                int second = st.pop();
                st.push(first*second);
            }else if(tokens[i].equals("/")) {
                int first = st.pop();
                int second = st.pop();
                st.push(second/first);
            }else{
                st.push(Integer.valueOf(tokens[i]));
            }
        }
         return st.pop();
    }
}
