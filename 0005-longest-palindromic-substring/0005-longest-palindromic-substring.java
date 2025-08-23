class Solution {
    public String longestPalindrome(String s) {
        int max_palindrom_left=0;
        int max_palindrom_right=0;
        for(int i=1;i<s.length()-1;i++){
            int palindrom_left=0;
            int palindrom_right=0;
            int left = i-1;
            int right=i+1;
            while(left>=0 && right<s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    palindrom_left = left;
                    palindrom_right=right;
                    if(--left !=-1){
                        left--;
                    }
                    if(++right !=s.length()){
                        right++;
                    }
                }else if(s.charAt(left)==s.charAt(i)){
                    if(--left !=-1){
                        left--;
                    }
                }else if(s.charAt(i)==s.charAt(right)){
                    if(++right !=s.length()){
                        right++;
                    }
                }else{
                    break;
                }
                max_palindrom_left = Math.min(palindrom_left,max_palindrom_left);
                max_palindrom_right = Math.max(palindrom_right,max_palindrom_right);
            }
        }
        return s.substring(max_palindrom_left,max_palindrom_right);
    }
}