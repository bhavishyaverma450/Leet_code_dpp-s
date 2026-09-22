class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        int length=ans.length();
        for(int left=0;left<s.length();left++){
            for(int right=left;right<s.length();right++){
                if(check(s,left,right)){
                    int temp=right-left+1;
                    if(temp>length){
                        length=temp;
                        ans=s.substring(left,right+1);
                    }
                }
            }
        }
        return ans;
    }
    public boolean check(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
        }
        return true;
    }
}