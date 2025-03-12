// Last updated: 3/12/2025, 9:56:24 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int maxLen=0;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();

        while(right<s.length()) {
            if (!set.contains(chars[right])) {
                set.add(chars[right]);
                right++;
            } else {
                set.remove(chars[left]);
                left++;
            }
            maxLen = Math.max(maxLen, right-left);
        }

        return maxLen;
    }
}