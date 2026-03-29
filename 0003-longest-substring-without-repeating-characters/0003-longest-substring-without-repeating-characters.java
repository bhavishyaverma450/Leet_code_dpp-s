class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length=0;
        HashSet<Character> set=new HashSet<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            length=Math.max(length,i-j+1);
        }
        return length;
    }
}