class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' ') {
            i++;
        }
        double result=0;
        boolean isNeg = false;
        boolean isPos = false;
        
        if(i<s.length() && s.charAt(i)=='-') {
            isNeg = true;
            i++;
        } else if(i<s.length() && s.charAt(i)=='+') {
            isPos = true;
            i++;
        }

            while(i<s.length()) {
                if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                    result = result*10+(s.charAt(i)-'0');
                } else {
                    break;
                }
                i++;
            }

        if(isNeg) {
           result = result*-1;
        }
        if(result<Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if(result>Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)result;
    }
}