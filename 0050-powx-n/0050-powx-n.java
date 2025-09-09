class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        long N = n;
        return exp(x,N);    
    }
    public double exp(double x,long n){
        if(n==0){
            return 1;
        }
        if (n < 0) {
            return 1.0 / exp(x, -n);
        }
        if(n%2==1){
            return x*exp(x*x,(n-1)/2);
        }else{
            return exp(x*x,n/2);
        }
    }
}