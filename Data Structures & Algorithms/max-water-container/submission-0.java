class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int area = 0;

        while(left < right) {
            int lh = heights[left];
            int rh = heights[right];

            int currArea = Math.min(lh,rh) * (right-left);

            if(currArea > area) {
                area = currArea;
            }

            if(lh < rh) {
                left++;
            } else {
                right--;
            }
        }
        return area;

    }
}
