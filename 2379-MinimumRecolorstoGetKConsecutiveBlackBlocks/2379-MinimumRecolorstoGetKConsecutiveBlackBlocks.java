// Last updated: 4/2/2025, 11:08:21 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start=0;
        int end=k;
        int minReColors=0;

        for(int i=start;i<end;i++) {
            if(blocks.charAt(i)=='W') {
                minReColors++;
            }
        }

        int temp = minReColors;

        while(end<blocks.length()) {
            if(blocks.charAt(start)=='W') {
                temp--;
            }

            if(blocks.charAt(end)=='W') {
                temp++;
            }

            minReColors = Math.min(minReColors, temp);
            start++;
            end++;
        }

        return minReColors;
    }
}