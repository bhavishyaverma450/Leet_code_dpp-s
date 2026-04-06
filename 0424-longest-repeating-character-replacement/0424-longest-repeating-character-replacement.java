class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int count=0;
        int length=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            count=Math.max(count,freq[s.charAt(right)-'A']);
            while((right-left+1)-count>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}