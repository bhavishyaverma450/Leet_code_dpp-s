class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;

        ArrayList<ArrayList<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<times.length;i++){
            int u=times[i][0];
            int v=times[i][1];
            int w=times[i][2];
            
            adj.get(u).add(new int[]{v,w});
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.offer(new int[]{k,0});
        while(!pq.isEmpty()){
            int[] curr=pq.poll();
            int node=curr[0];
            int distance=curr[1];
            if(distance>dist[node])continue;

            for(int[] temp:adj.get(node)){
                int adjNode=temp[0];
                int wt=temp[1];
                if(wt+distance<dist[adjNode]){
                    dist[adjNode]=wt+distance;
                    pq.offer(new int[]{adjNode,dist[adjNode]});
                }
            }
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            if(dist[i]==Integer.MAX_VALUE)return -1;
            ans=Math.max(ans,dist[i]);
        }
        return ans;
    }
}