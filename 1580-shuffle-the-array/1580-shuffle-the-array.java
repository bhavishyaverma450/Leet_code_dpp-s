class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = n*2;
        int []res = new int[m];

        for(int i=0;i<n;i++)
        {
            res[2*i] = nums[i]; 
        }
        for(int i=0;i<n;i++)
        {
            res[2*i+1]=nums[i+n];
        }
        return res;
    }
}