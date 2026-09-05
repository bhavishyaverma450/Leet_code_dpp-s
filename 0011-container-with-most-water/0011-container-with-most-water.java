class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxA=0;
        while(i<j){
            int l=j-i;
            int b=Math.min(height[i],height[j]);
            maxA=Math.max(maxA,l*b);
            if(height[i]>height[j])j--;
            else i++;
        }
        return maxA;
    }
}