class Solution {
    public int maxDepth(String s) {
        int max_depth=0;
        int depth=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                depth++;
            }else if(s.charAt(i)==')'){
                max_depth = Math.max(max_depth,depth);
                depth--;
            }else{
                continue;
            }
        }
        return max_depth;
    }
}