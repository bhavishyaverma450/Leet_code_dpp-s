class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] alphabats = new int[26];
        for(int i=0;i<s.length();i++){
            alphabats[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            alphabats[t.charAt(i)-'a']--;
        }
        for(int i=0;i<alphabats.length;i++){
            if(alphabats[i]!=0){
                return false;
            }
        }
        return true;
    }
}