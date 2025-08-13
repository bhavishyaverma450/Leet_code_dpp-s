class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int m=0;
        int h = nums.length-1;

        while(m<=h){
            switch(nums[m]){
                case 0:
                    int temp = nums[l];
                    nums[l] = nums[m];
                    nums[m] = temp;
                    l++;
                    m++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    int temp1 = nums[m];
                    nums[m] = nums[h];
                    nums[h] = temp1;
                    h--;
                    break;
            }
        }
    }
}