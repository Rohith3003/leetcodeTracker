// Last updated: 3/11/2025, 10:14:03 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        int target = threshold * k;

        for(int i=0;i<k;i++) {
            sum+=arr[i];
        }

        if (sum >= target) count++;

        for (int i = k; i < arr.length; i++) {
            sum = sum+arr[i]-arr[i-k];      
            if (sum >= target) count++;
        }

        return count;
    }
}