class Solution {
    public int reverse(int x) {
        long temp=0;
        while(x!=0){
            int digit=x%10;
            temp=temp*10+digit;
            x/=10;
        }
        if(temp<Integer.MIN_VALUE || temp>Integer.MAX_VALUE)return 0;
        if(x<0)return (int)(-1*temp);
        else return (int)(temp);
    }
}