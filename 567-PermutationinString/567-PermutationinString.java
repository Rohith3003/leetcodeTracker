class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        // Count frequency of characters in s1
        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            windowFreq[s2.charAt(right) - 'a']++;

            if (right - left + 1 > s1.length()) {
                windowFreq[s2.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(s1Freq, windowFreq)) return true;
        }

        return false;
    }
}
