class Solution{
    public String longestPalindrome(String s){
        if(s==null || s.length()<2) return s;

        int maxLeft=0;
        int maxRight=0;
        for(int i=0;i<s.length();i++){
            int[] odd = expandFromCenter(s,i,i);
            if(odd[1]-odd[0]>maxRight-maxLeft){
                maxLeft=odd[0];
                maxRight=odd[1];
            }
            int[] even = expandFromCenter(s,i,i+1);
            if(even[1]-even[0]>maxRight-maxLeft){
                maxLeft=even[0];
                maxRight = even[1];
            }
        }
        return s.substring(maxLeft,maxRight+1);
    }
    public int[] expandFromCenter(String s,int left,int right){
        while(left>=0 && right<s.length() && (s.charAt(left)==s.charAt(right))){
            left--;
            right++;
        }
        return new int[]{left+1,right-1};
    }
}