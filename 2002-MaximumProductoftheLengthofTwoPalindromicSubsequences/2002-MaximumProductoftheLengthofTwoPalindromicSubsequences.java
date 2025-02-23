// Last updated: 2/23/2025, 11:15:37 PM
import java.util.*;

class Solution {
    private Map<String, Integer> dp = new HashMap<>();
    
    public int maxProduct(String s) {
        return dfs(s.toCharArray(), 0, "", "");
    }
    
    private int dfs(char[] c, int i, String s1, String s2) {
        if (i >= c.length) {
            if (isPalindrome(s1) && isPalindrome(s2)) {
                return s1.length() * s2.length();
            }
            return 0;
        }
        
        // Memoization key
        String key = i + "|" + s1 + "|" + s2;
        if (dp.containsKey(key)) return dp.get(key);

        // Explore three choices
        int option1 = dfs(c, i + 1, s1 + c[i], s2); // Add to s1
        int option2 = dfs(c, i + 1, s1, s2 + c[i]); // Add to s2
        int option3 = dfs(c, i + 1, s1, s2);        // Skip character

        // Store the max product in the DP table
        int result = Math.max(option1, Math.max(option2, option3));
        dp.put(key, result);
        return result;
    }

    private boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
