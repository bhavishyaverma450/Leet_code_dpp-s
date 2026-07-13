class Solution {
    class DSU{
        int[] parent;
        int[] size;
        public DSU(int n){
            parent=new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
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
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        DSU dsu = new DSU(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1)dsu.union(i,j);
            }
        }
        for(int i=0;i<dsu.parent.length;i++){
            if(dsu.parent[i]==i)count++;
        }
        return count;
    }
}