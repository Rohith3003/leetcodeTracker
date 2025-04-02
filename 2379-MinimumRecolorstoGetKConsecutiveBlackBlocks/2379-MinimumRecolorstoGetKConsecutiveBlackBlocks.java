// Last updated: 4/2/2025, 11:01:38 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start=0;
        int end=k;
        int minReColors=Integer.MAX_VALUE;;

        while(end<=blocks.length()) {
            int tempRes=0;
            for(int i=start;i<end;i++) {
                if(blocks.charAt(i)=='W') {
                    tempRes++;
                }
            }
            minReColors = Math.min(minReColors, tempRes);
            start++;
            end++;
        }

        return minReColors;
    }
}