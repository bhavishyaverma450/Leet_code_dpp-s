class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        for(int i=0;child<g.length && i<s.length;i++){
            if(g[child]<=s[i])child++;
        }
        return child;
    }
}