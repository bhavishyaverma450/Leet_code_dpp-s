class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int num:nums){
            int currSum=0;
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                    currSum+=i;
                }
                if(count>4)break;
            }
            if(count==4)sum+=currSum;
        }
        return sum;
    }
}