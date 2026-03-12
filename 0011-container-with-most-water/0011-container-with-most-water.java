class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int length=right-left;
            int h=Math.min(height[left],height[right]);
            area=Math.max(area,h*length);
            if(height[left]<height[right])left++;
            else right--;
        }
        return area;
    }
}