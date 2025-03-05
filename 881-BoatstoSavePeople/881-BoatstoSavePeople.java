// Last updated: 3/5/2025, 10:29:35 PM
class Solution {
    public int numRescueBoats(int[] people, int limit) {
   int[] weightCount = new int[limit + 1];
    for (int p : people) {
        weightCount[p]++;
    }

    int i = 1, j = limit, boats = 0;

    while (i <= j) {
        while (i <= j && weightCount[i] <= 0) i++;  // Find next lightest person
        while (i <= j && weightCount[j] <= 0) j--;  // Find next heaviest person
        
        if (i > j) break;

        boats++;
        if (i + j <= limit && weightCount[i] > 0 && weightCount[j] > 0) {
            weightCount[i]--;
        }
        weightCount[j]--; 
    }

    return boats;
  }
}