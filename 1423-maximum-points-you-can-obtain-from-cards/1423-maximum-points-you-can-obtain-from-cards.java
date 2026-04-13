class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum=0,rightSum=0;
        for(int i=0;i<=k-1;i++){
            leftSum+=cardPoints[i];
        }
        int right=cardPoints.length-1;
        int maxSum=0;
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[right];
            right--;

            maxSum=Math.max(maxSum,leftSum+rightSum);
        }
        return maxSum;
    }
}