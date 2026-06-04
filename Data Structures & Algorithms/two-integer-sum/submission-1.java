class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map =new HashMap<>();
        map.put(nums[0],0);

        for(int i=1; i<nums.length ; i++) {
            int remaining = target - nums[i];
          //  System.out.println( "i " + i + " nums[i] " + nums[i]+ " remaining " + remaining);
            if(map.containsKey(remaining)) {
                result[0] = map.get(remaining);
                result[1] = i;
                return result;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}
