// Last updated: 3/2/2025, 10:22:31 PM
class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int area=0;

        while(start<end) {
            int length = end-start;
            int breadth = Math.min(height[start],height[end]);

            area = Math.max(area, length*breadth);

            if(height[start]<height[end]) {
                while(start<end && height[start+1]<height[start]) {
                    start++;
                }
                start++;
            } else {
                while(start<end && height[end-1]<height[end]) {
                    end--;
                }
                end--;
            }
        }

        return area;
    }
}