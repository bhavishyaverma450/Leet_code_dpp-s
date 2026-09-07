class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int i=s.length()-1;
        int length=1;
        while(i>=0 && s.charAt(i)!=' '){
            length++;
            i--;
        }
        return length-1;
    }
}