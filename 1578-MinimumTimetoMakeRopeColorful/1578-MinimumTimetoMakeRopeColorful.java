// Last updated: 3/10/2025, 10:39:58 PM
class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totalTime = 0;
        int sum = neededTime[0];
        int maxCost = neededTime[0];

        for (int i = 1; i < colors.length(); i++) {
            if (colors.charAt(i) == colors.charAt(i - 1)) { 
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
