// Last updated: 2/27/2025, 10:08:13 PM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {

            if(i>0 && nums[i]==nums[i-1]) continue;

            for(int j=i+1;j<nums.length;j++) {

                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int start = j+1;
                int end = nums.length-1;

                while(start<end) {
                    long sum = (long)nums[i] + nums[j] + nums[start] + nums[end];

                    if(sum<target) {
                        start++;
                    } else if(sum>target) {
                        end--;
                    } else {
                        result.add(List.of(nums[i], nums[j], nums[start], nums[end]));
                        while(start<end && nums[start]==nums[start+1]) {
                            start++;
                        }
                        while(start<end && nums[end]==nums[end-1]) {
                            end--;
                        }
                        start++;
                        end--;
                    }
                }
            }
        }

        return result;
    }
}