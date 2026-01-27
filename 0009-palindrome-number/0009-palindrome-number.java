class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        return isPalindrome(str,0,str.length()-1);
    }
    public boolean isPalindrome(String str,int s,int e){
        if(s>e)return true;
        if(str.charAt(s)!=str.charAt(e))return false;
        else return isPalindrome(str,s+1,e-1);
    }
}