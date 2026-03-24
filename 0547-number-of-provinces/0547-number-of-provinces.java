class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] vis=new boolean[n];
        Arrays.fill(vis,false);
        int count=0;

        List<List<Integer>> adj=convert(isConnected);
        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                count++;
            }
        }
        return count;
    }
    public List<List<Integer>> convert(int[][] arr){
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1 && i!=j)adj.get(i).add(j);
            }
        }
        return adj;
    }
    public void dfs(int node,List<List<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
                vis[it]=true;
                dfs(it,adj,vis);
            }
        }
    }
}