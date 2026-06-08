class Solution {
    public int longestConsecutive(int[] nums) {
        int lon = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0 ;i<nums.length; i++) {
            lon = (nums[i]>lon)? nums[i]:lon;
            small = (nums[i]<small)?nums[i]:small;
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        int con = 0;
        int longest = 0;

        for(int i=small ;i<=lon;i++){

            while(map.containsKey(i)) {
                con++;
                i++;
            }

            if(con>longest) {
                longest=con;
            }
            con =0;
        }
        return longest;
    }
}
