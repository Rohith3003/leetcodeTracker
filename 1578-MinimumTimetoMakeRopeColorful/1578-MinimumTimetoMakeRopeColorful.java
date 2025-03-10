class Solution {
    public int minCost(String colors, int[] neededTime) {
        int start=0;
        int ptr=1;
        int result=0;
        int len = colors.length();

        while(ptr<len) {
            int sum = neededTime[start];
            int max = neededTime[start];
            while(ptr<len && colors.charAt(ptr)==colors.charAt(start)) {
                sum+=neededTime[ptr];
                max = Math.max(max, neededTime[ptr]);
                ptr++;
            }
            start=ptr;
            ptr++;
            result += (sum-max);
        }

        return result;
    }
}