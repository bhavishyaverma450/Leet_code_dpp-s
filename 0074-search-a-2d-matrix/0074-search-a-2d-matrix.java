class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int col=0;col<m;col++){
            if(binarySearch(matrix,col,target)){
                return true;
            }
        }
        return false;
    }
    public boolean binarySearch(int[][] arr,int col,int target){
        int s=0,e=arr.length-1;
        if(target<arr[s][col] || target>arr[e][col])return false;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid][col]==target) return true;
            else if(arr[mid][col]>target) e=mid-1;
            else s=mid+1;
        }
        return false;
    }
}