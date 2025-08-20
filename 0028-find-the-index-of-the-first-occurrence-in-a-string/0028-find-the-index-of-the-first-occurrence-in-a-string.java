class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        if(!haystack.contains(needle)){
            index=-1;
        }else{
            index = haystack.indexOf(needle);
        }
        return index;
    }
}