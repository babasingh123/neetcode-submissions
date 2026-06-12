class Solution {
    public boolean isValid(String s) {
        int start = 0;
        int end = s.length()-1;
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else if (ch == ')') {
                 if(st.isEmpty() || st.pop() != '('){
                    return false;
                }
            }  else if (ch == ']') {
                if(st.isEmpty() || st.pop() != '['){
                    return false;
                }
            } else if (ch == '}') {
                if(st.isEmpty() || st.pop() != '{'){
                    return false;
                }
            }
        }
        if(st.isEmpty()){
        return true;
        }else{
            return false;
        }
    }
}
