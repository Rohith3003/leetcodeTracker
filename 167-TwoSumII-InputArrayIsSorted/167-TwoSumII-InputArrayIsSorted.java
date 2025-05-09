class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end = numbers.length-1;

        while(start<end) {
            int currSum = numbers[start]+numbers[end];
            if(currSum>target) {
                end--;
            } else if(currSum<target) {
                start++;
            } else {
                return new int[]{start+1, end+1};
            }
        }

        return new int[]{-1, -1};
    }
}