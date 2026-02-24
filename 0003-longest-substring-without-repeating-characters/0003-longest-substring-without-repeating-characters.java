class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int ans=0,j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j++));
            }
            set.add(ch);
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}