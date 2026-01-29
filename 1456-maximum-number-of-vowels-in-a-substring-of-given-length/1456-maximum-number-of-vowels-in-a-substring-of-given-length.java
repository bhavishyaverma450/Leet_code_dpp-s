class Solution {
    public int maxVowels(String s, int k) {
        int maxCount=0;
        int count=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
            if(i-j+1==k){
                maxCount=Math.max(maxCount,count);
                if(isVowel(s.charAt(j))){
                    count--;
                }
                j++;
            }
        }
        return maxCount;
    }
    public boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}