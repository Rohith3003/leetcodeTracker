// Last updated: 2/22/2025, 11:50:04 PM
class Solution {
    public int minSwaps(String s) {
        int openCount=0;
        int closedCount=0;
        int swaps=0;

        for(char c: s.toCharArray()) {
            if(c=='[') {
                openCount++;
            } else if(c==']') {
                closedCount++;
            }

            if(closedCount>openCount) {
                swaps++;
                openCount++;
                closedCount--;
            }
        }

        return swaps;
    }
}