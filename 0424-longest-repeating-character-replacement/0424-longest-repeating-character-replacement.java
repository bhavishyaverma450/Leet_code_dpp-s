class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int i=0;
        int length=0;
        int maxCount=0;

        for(int j=0;j<s.length();j++){
            count[s.charAt(j)-'A']++;
            maxCount = Math.max(maxCount,count[s.charAt(j)-'A']);

            while((j-i+1)-maxCount>k){
                count[s.charAt(i)-'A']--;
                i++;
            }

            length = Math.max(length,j-i+1);
        }
        return length;
    }
}