// Last updated: 3/8/2025, 12:13:52 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);

        int start=0;

        while(start+1<nums.length) {
            int temp = nums[start];
            nums[start] = nums[start+1];
            nums[start+1] = temp;
            start+=2;
        }

        return nums;
    }
}