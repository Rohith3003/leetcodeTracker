// Last updated: 3/5/2025, 10:22:49 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        int n = people.length-1;
        int start=0, end=n;
        int reqBoats=0;

        while(start<=end) {
            if(people[start]+people[end]>limit) {
                end--;
            } else {
                start++;
                end--;
            }
            reqBoats++;
        }

        return reqBoats;
    }
}