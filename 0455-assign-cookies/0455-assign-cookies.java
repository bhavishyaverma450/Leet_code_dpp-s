class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        for(int i=0;i<g.length && child<s.length;i++){
            if(g[i]<=s[child])child++;
        }
        return child;
    }
}