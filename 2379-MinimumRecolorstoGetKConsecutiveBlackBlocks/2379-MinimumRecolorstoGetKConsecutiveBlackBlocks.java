// Last updated: 4/2/2025, 11:09:34 AM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int start = 0;
        int minReColors = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                minReColors++;
            }
        }

        int temp = minReColors;


        for (int end = k; end < blocks.length(); end++) {
            if (blocks.charAt(start) == 'W') {
                temp--; 
            }

            if (blocks.charAt(end) == 'W') {
                temp++; 
            }

            minReColors = Math.min(minReColors, temp);
            start++;
        }

        return minReColors;
    }
}
