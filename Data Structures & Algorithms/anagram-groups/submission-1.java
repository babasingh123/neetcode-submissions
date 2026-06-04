class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            map.putIfAbsent(temp, new ArrayList<>());
            map.get(temp).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
