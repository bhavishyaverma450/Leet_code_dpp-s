class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        ArrayList<ArrayList<Integer>> adj=convert(isConnected);

        boolean[] vis=new boolean[adj.size()];
        Arrays.fill(vis,false);

        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                count++;
            }
        }
        return count;
    }
    public ArrayList<ArrayList<Integer>> convert(int[][] arr){
        int n=arr.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }
        return adj;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
                vis[it]=true;
                dfs(it,adj,vis);
            }
        }
    }
}