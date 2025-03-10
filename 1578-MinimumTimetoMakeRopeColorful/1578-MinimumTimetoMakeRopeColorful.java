// Last updated: 3/10/2025, 10:23:29 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int start=0;
        int result=0;
        int len = colors.length();

        for (int ptr = 1; ptr < len; ptr++) {
            if (colors.charAt(ptr) == colors.charAt(start)) {
                result += Math.min(neededTime[start], neededTime[ptr]);  
                neededTime[ptr] = Math.max(neededTime[start], neededTime[ptr]);  
            }
            start = ptr;
        }

        return result;
    }
}