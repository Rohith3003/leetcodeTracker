class Solution {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        int count=1;
        for(int i=1;i<nums.length;i++) {
           if(nums[i]==nums[i-1] && count<2) {
              nums[idx++] = nums[i];
              count++;
           } else if(nums[i]!=nums[i-1]){
              count=1;
              nums[idx++] = nums[i];
           }
        }

        return idx;
    }
}