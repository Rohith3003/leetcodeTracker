class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> sumFreqMap = new HashMap<>();
        sumFreqMap.put(0,1);
        int prefixSum=0;
        int count=0;

        for(int num:nums) {
            prefixSum += num;

            if(sumFreqMap.containsKey(prefixSum-k)) {
                count+=sumFreqMap.get(prefixSum-k);
            }

            sumFreqMap.put(prefixSum, sumFreqMap.getOrDefault(prefixSum, 0)+1);
        }

        return count;
    }
}