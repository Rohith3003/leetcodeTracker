// Last updated: 3/11/2025, 10:09:38 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start=0;
        int end = k-1;
        int count=0;
        int sum=0;

        for(int i=start;i<end;i++) {
            sum+=arr[i];
        }

        while(end<arr.length) {
            sum+=arr[end];
            int avg = sum/k;
            if(avg>=threshold) {
                count++;
            }
            sum-=arr[start];
            start++;
            end++;
        }

        return count;
    }
}