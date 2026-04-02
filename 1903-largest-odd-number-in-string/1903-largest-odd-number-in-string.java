class Solution {
    public String largestOddNumber(String num) {
        int i=num.length()-1;
        StringBuilder sb=new StringBuilder();
        while(i>=0){
            char ch=num.charAt(i);
            if((ch-'0')%2!=0){
                sb.append(num.substring(0,i+1));
                return sb.toString();
            }
            i--;
        }
        return sb.toString();
    }
}