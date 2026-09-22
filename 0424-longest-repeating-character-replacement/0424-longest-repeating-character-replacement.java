class Solution {
    public int characterReplacement(String s, int k) {
        int length=0;
        int left=0;
        int maxF=0;
        int[] hash=new int[26];
        for(int right=0;right<s.length();right++){
            hash[s.charAt(right)-'A']++;
            maxF=Math.max(maxF,hash[s.charAt(right)-'A']);

            int len=right-left+1;
            if(len-maxF>k){
                hash[s.charAt(left)-'A']--;
                left++;
            }
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}