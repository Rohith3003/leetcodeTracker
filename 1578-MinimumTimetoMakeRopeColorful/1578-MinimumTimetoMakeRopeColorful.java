// Last updated: 3/10/2025, 10:41:59 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int sum = neededTime[0];
        int maxCost = neededTime[0];
        char[] colorsArr = colors.toCharArray();
        int len = colors.length();

        for (int i = 1; i < len; i++) {
            if (colorsArr[i] == colorsArr[i-1]) { 
                sum += neededTime[i];
                maxCost = Math.max(maxCost, neededTime[i]);
            } else {
                totalTime += (sum - maxCost);
                sum = neededTime[i];
                maxCost = neededTime[i];
            }
        }

        totalTime += (sum - maxCost);
        return totalTime;
    }
}
