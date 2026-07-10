class Solution {
    public int findJudge(int n, int[][] trust) {
        int m=trust.length;
        if(n==1)return n;
        int[] inDegree=new int[n+1];
        int[] outDegree=new int[n+1];

        for(int i=0;i<m;i++){
            int p1=trust[i][0];
            int p2=trust[i][1];
            
            inDegree[p2]++;
            outDegree[p1]++;
        }

        for(int i=0;i<=n;i++){
            if(inDegree[i]==n-1 && outDegree[i]==0)return i;
        }
        return -1;
    }
}