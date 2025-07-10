class Solution {
    public int strStr(String haystack, String needle) {
        int ans = -1;
        if(!haystack.contains(needle)){
            return ans;
        }else{
            ans = haystack.indexOf(needle);
        }
        return ans;
    }
}