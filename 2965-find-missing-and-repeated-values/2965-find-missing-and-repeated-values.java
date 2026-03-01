class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int num=grid[i][j];
                if(map.containsKey(num)){
                    arr[0]=num;
                }
                map.put(num,map.getOrDefault(num,0)+1);
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