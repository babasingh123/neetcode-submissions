class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] res = new int[n];

        int pre = 1;
        int suf = 1;

        for(int i = 0 ; i<n ; i++) {
            prefix[i] = pre;
            pre = pre * nums[i];

            suffix[n-i-1] = suf;
            suf = suf * nums[n-i-1];

        }

        for(int i = 0 ; i<n ; i++) {
            res[i] = prefix[i]*suffix[i];
        }

        return res;
    }
}  
