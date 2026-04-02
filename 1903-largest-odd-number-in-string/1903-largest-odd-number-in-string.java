class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        while(i>=0){
            char ch=num.charAt(i);
            if((ch-'0')%2!=0){
                return num.substring(0,i+1);
            }
            i--;
        }
        return "";
    }
}