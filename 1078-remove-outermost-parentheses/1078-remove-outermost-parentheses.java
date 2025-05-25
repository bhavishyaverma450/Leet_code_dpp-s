class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int left=0;
        int right=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                count++;
            }
            if(s.charAt(i)==')'){
                count--;
                if(count==0){
                    right=i;
                    str.append(s.substring(left+1,right));
                    left = ++right;
                }
            }
        }
        return str.toString();
    }
}