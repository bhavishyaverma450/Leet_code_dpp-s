class Solution {
    public int myAtoi(String s) {
        int i=0;
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        int neg=1;
        if(i<s.length() && (s.charAt(i)=='+'||s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                neg=-1;
            }
            i++;
        }
        long ans=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            ans=ans*10+digit;
            if(neg*ans<Integer.MIN_VALUE)return Integer.MIN_VALUE;
            if(neg*ans>Integer.MAX_VALUE)return Integer.MAX_VALUE;
            i++;
        }
        return (int)(neg*ans);
    }
}