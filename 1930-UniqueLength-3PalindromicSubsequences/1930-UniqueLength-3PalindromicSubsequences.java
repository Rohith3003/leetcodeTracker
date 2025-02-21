// Last updated: 2/22/2025, 12:26:38 AM
class Solution {
    public int countPalindromicSubsequence(String s) {
        // Map<Character, Integer> charIdx = new HashMap<>();
        // int count=0;
        // charIdx.put(s.charAt(0), 0);
        // charIdx.put(s.charAt(1), 1);
        // for(int i=2;i<s.length();i++) {
        //     char curr = s.charAt(i);
        //     if(charIdx.containsKey(curr)) {

        //     }
        // }

        // return count;

        int[] firstIdx = new int[26];
        int[] lastIdx = new int[26];
        Arrays.fill(firstIdx, -1);
        Arrays.fill(lastIdx, -1);
        int count=0;

        for(int i=0;i<s.length();i++) {
            char curr = s.charAt(i);
            if(firstIdx[curr-'a']==-1) {
                firstIdx[curr-'a'] = i;
            }
            lastIdx[curr-'a']=i;
        }

        for(int i=0;i<26;i++) {
            if(firstIdx[i]!=-1 && firstIdx[i]<lastIdx[i]) {
                Set<Character> unqChars = new HashSet<>();
                for(int j=firstIdx[i]+1;j<lastIdx[i];j++) {
                    unqChars.add(s.charAt(j));
                }

                count+=unqChars.size();
            }
        }

        return count;
    }
}