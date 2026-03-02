class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map.containsKey(grid[i][j])){
                    arr[0]=grid[i][j];
                }
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        n=n*n;
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                arr[1]=i;
                break;
            }
        }
        return arr;
    }
}