class Solution {
    class DSU{
        int[] parent;
        int[] size;
        DSU(int n){
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
            if(size[upu]>size[upv]){
                parent[upv]=parent[upu];
                size[upu]+=size[upv];
            }else{
                parent[upu]=parent[upv];
                size[upv]+=size[upu];
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int m=isConnected.length;
        DSU dsu=new DSU(m);

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(isConnected[i][j]==1)dsu.union(i,j);
            }
        }
        int count=0;
        for(int i=0;i<dsu.parent.length;i++){
            if(dsu.parent[i]==i)count++;
        }        
        return count;
    }
}