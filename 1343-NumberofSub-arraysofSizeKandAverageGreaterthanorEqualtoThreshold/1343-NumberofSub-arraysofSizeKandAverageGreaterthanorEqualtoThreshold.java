class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start=0;
        int end = k-1;
        int count=0;

        while(end<arr.length) {
            int sum=0;
            for(int i=start;i<=end;i++) {
                sum+=arr[i];
            }
            int avg = sum/k;
            if(avg>=threshold) {
                count++;
            }
            start++;
            end++;
        }

        return count;
    }
}