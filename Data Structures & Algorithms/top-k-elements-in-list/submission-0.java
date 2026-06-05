class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        int n = nums.length;

        for(int i =0 ; i<n ; i++) {
            map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
        }

        List<Integer>[] bucket = new ArrayList[n+1];

        map.forEach((Key,Value) -> {
         //   System.out.println(Key + " " + Value);
            if(bucket[Value]!=null && !bucket[Value].isEmpty()) {
                bucket[Value].add(Key);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(Key);
                bucket[Value] = temp;
            }
        }
        );

        int[] result = new int[k];
        int count=0;

        for(int i=n ; i>=0 ; i--) {
            if(bucket[i] != null && !bucket[i].isEmpty()) {
                for(int freq:bucket[i]) {
                  //  System.out.println(freq);
                    result[count] = freq;
                    count++;
                    if(count==k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
