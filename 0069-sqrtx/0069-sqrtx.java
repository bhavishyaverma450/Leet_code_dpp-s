class Solution {
    public int mySqrt(int x) {
        long ans=0;
        long l=0;
        long h = x;
        while(l<=h)
        {
            long mid = l+(h-l)/2;
            if(mid*mid==x)
            {
                return (int)mid;
            }
            else if(mid*mid<x)
            {
                ans = mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
    return (int)ans;
    }
}