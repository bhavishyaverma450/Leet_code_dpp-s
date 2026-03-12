class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;

        while(left<right){
            int length=right-left;
            int h1=height[left];
            int h2=height[right];
            if(h1<h2){
                area=Math.max(area,h1*length);
                left++;
            }else if(h1>h2){
                area=Math.max(area,h2*length);
                right--;
            }else{
                area=Math.max(area,h1*length);
                left++;
            }
        }
        return area;
    }
}