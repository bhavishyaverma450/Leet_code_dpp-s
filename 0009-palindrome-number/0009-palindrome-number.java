class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;

        int rev = 0;
        int num=x;
        while(num!=0){
            int digit = num%10;
            rev = (rev*10) + digit;
            num=num/10;
        }

        if(x==rev){
            return true;
        }
        return false;
    }
}