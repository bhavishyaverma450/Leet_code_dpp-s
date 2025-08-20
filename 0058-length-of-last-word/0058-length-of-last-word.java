class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int res=0;
        for(int i=str.length()-1;i>0;i--){
            if(str.charAt(i-1)==' '){
                break;
            }else{
                res++;
            }
        }
        return res+1;
    }
}