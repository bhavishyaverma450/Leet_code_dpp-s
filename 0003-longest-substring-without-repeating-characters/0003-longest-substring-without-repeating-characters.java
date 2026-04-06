class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        HashSet<Character> set=new HashSet<>();
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            length=Math.max(length,right-left+1);
        }
        return length;
    }
}