// Last updated: 3/3/2025, 11:45:41 PM
class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;

        int start=0, end=n-1;
        int count=0;

        int mod = 1_000_000_007;

        int[] power = new int[n];
        power[0] = 1;

        for(int i=1;i<n;i++) {
            power[i] =  (power[i-1]*2)%mod;
        }

        while(start<=end) {
            if(nums[start]+nums[end]<=target) {
                count = (count+power[end-start])%mod;
                start++;
            } else {
                end--;
            }
        }

        return count%mod;
    }
}