class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int left=0;left<s.length();left++){
            for(int right=left;right<s.length();right++){
                if(check(s,left,right)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean check(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;right--;
        }
        return true;
    }
}