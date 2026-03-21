class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1)return s;

        int maxLen=1;
        String maxStr=s.substring(0,1);
        for(int i=0;i<n;i++){
            for(int j=i+maxLen;j<n;j++){
                if(j-i+1>maxLen && isPalin(s.substring(i,j+1))){
                    maxLen=j-i+1;
                    maxStr=s.substring(i,j+1);
                }
            }
        }
        return maxStr;
    }
    public boolean isPalin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))return false;
            i++;j--;
        }
        return true;
    }
}