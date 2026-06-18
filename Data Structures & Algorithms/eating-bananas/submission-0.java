class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int num : piles) {
            max = Math.max(num,max);
        }

        int low =1;
        int high = max;
        int speed = max;
        while(low<=high) {
            int total = 0;
            int mid = low + (high-low)/2;
            for(int num : piles) {
                total += (num + mid -1)/mid;
            }

            if(total <= h) {
                high = mid -1;
                speed = mid;
            } else {
                low = mid + 1;
            }
        }
        return speed;
    }
}
