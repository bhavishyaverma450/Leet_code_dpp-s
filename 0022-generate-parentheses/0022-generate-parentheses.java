class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        dfs(n,n,sb,list);
        return list;
    }
    public void dfs(int open,int close,StringBuilder sb,List<String> list){
        if(open==0 && close==0){
            list.add(sb.toString());
            return;
        }
        if(open>0){
            sb.append("(");
            dfs(open-1,close,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close>open){
            sb.append(")");
            dfs(open,close-1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}