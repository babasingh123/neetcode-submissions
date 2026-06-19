class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(nums[n-1] >= nums[0]) {
            return nums[0];
        }

        int low = 0;
        int high = n-1;

        int right = nums[0]; 
        int left = nums[n-1];

        while(low <= high) {
            int mid  = low + (high-low)/2;
            System.out.println(mid + " " + nums[mid]);
            if(mid !=0 && mid != n-1 && nums[mid]<nums[mid-1] && nums[mid]<nums[mid+1]) {
                System.out.println("case1");
                return nums[mid];
            }else if(mid ==0 && nums[mid]>nums[mid+1]){
                System.out.println("case2");
                return nums[mid+1];
            }else if(mid == n-1 && nums[mid]<nums[mid-1]){
                System.out.println("case3");
                return nums[mid];
            }else if(nums[mid]<right){
                System.out.println("case4");
                high = mid-1;
            }else{
                System.out.println("case5");
                low = mid+1;
            }
        } 
        return -1;
    }
}
