class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adj=convert(isConnected);
        int count=0;
        boolean[] vis=new boolean[n];
        Arrays.fill(vis,false);

        for(int i=0;i<adj.size();i++){
            if(!vis[i]){
                dfs(i,adj,vis);
                count++;
            }
        }
        return count;
    }
    public void dfs(int node,List<List<Integer>> adj,boolean[] vis){
        vis[node]=true;
        for(int t:adj.get(node)){
            if(!vis[t]){
                vis[t]=true;
                dfs(t,adj,vis);
            }
        }
    }
    public List<List<Integer>> convert(int[][] arr){
        int n=arr.length;
        List<List<Integer>> adj=new ArrayList<>();
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
}