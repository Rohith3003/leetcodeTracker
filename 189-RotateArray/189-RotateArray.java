class Solution {
    public void rotate(int[] nums, int k) {

        int start=0;
        int end=nums.length-1;
        k=k%nums.length;

        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start=0;
        end=Math.min(k-1, nums.length-1);

        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        start = k;
        end=nums.length-1;

        while(start<end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}