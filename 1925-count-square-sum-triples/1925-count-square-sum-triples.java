class Solution {
    public int countTriples(int n) {
        int count =0 ;
        for(int a=1;a<n;a++){
            for(int b=a+1;b<n;b++){
                int sumSquares = a*a+b*b;
                int c = (int)Math.sqrt(sumSquares);
                if(c*c==sumSquares && c<=n){
                    count+=2;
                }
            }
        }
        return count;
    }
}