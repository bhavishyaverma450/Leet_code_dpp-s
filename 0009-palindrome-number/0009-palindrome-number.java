class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        return palin(str,0,str.length()-1);
    }
    public boolean palin(String str,int s,int e){
        if(s>e)return true;
        if(str.charAt(s)!=str.charAt(e))return false;
        return palin(str,s+1,e-1);
    }
}