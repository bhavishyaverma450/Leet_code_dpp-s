class Solution {
    class DSU{
        int[] parent;
        int[] size;
        public DSU(int n){
            parent=new int[n+1];
            size=new int[n+1];

            for(int i=0;i<=n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        public int find(int node){
            if(parent[node]==node)return node;
            return parent[node]=find(parent[node]);
        }
        public void union(int u,int v){
            int upu=find(u);
            int upv=find(v);

            if(size[upu]>=size[upv]){
                parent[upv]=parent[upu];
                size[upu]+=size[upv];
            }else{
                parent[upu]=parent[upv];
                size[upv]+=size[upu];
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        DSU ds = new DSU(n);
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            ds.union(u,v);
        }
        if(ds.find(source)==ds.find(destination))return true;
        return false;
    }
}