class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0, rightSum=0;
        int maxSum=0;
        for(int i=0;i<=k-1;i++){
            leftSum += cardPoints[i];
        }
        maxSum = leftSum;

        int right=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[right];
            right--;


            int sum = leftSum+rightSum;
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
}