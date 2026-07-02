class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> unique = new HashSet<>();
        int start = 0;
        int len = 0;
        char[] str = s.toCharArray();
        for(int end = 0 ; end < str.length ; end++) {
            char ch = str[end];

            if(unique.contains(ch)) {
                len = Math.max(len , unique.size());

                while(str[start] != ch) {
                    unique.remove(str[start]);
                    start++;
                }
                unique.remove(str[start]);
                start++;
                unique.add(ch);
            } else {
                unique.add(ch);
            } 
        }
        len = Math.max(len, unique.size());
        return len;
    }
}
