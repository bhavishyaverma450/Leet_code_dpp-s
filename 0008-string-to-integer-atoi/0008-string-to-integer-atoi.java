class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }

        boolean negative = false;
        if(i<s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            negative = (s.charAt(i)=='-');
            i++; 
        }

        int res=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';

            if(res>(Integer.MAX_VALUE-digit)/10){
                return negative? Integer.MIN_VALUE: Integer.MAX_VALUE;
            }

            res = res*10 + digit;
            i++;
        }
        return negative?-res:res;
    }
}