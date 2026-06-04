class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);

            if(!map.containsKey(temp)) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(strs[i]);
                map.put(temp, newGroup);
            } else {
                List<String> existingGroup = map.get(temp);
                existingGroup.add(strs[i]);
                map.put(temp, existingGroup);
            }
        }

        return new ArrayList<>(map.values());
    }
}
