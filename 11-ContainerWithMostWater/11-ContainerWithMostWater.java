// Last updated: 3/2/2025, 10:30:20 PM
class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int area=0;

        while(start<end) {
            int length = end-start;
            int breadth = Math.min(height[start],height[end]);

            area = Math.max(area, length*breadth);

            while(start<end && height[start]<=breadth) {
                start++;
            }
            while(start<end && height[end]<=breadth) {
                end--;
            }
        }

        return area;
    }
}