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
                start++;
            } else {
                end--;
            }
        }

        return area;
    }
}