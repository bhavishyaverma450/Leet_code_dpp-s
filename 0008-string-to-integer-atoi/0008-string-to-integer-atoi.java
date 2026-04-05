class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int neg=1;
        if(i<s.length() && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            if(s.charAt(i)=='-')neg=-1;
            i++;
        }
        long res=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            res=(res*10)+digit;
            if(neg*res>Integer.MAX_VALUE)return Integer.MAX_VALUE;
            if(neg*res<Integer.MIN_VALUE)return Integer.MIN_VALUE;
            i++;
        }
        return (int)(neg*res);
    }
}