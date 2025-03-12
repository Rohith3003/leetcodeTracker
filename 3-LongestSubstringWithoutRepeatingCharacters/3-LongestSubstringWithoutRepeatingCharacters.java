// Last updated: 3/12/2025, 9:57:26 PM
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
                maxLen = Math.max(maxLen, right-left+1);
                right++;
            } else {
                set.remove(chars[left]);
                left++;
            }
        }

        return maxLen;
    }
}