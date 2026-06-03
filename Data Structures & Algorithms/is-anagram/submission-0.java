class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0 ; i <s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        for(char c : t.toCharArray()) {
            if(!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            map.put(c, map.get(c)-1);
        }

        return true;

    }
}
