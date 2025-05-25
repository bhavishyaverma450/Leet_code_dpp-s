class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<Character>();
        int max_depth = 0;
        int left=0;
        int right=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                stack.push('(');
                left++;
                if(left-right>max_depth){
                    max_depth=left-right;
                }
            }else if(ch==')'){
                stack.pop();
                right++;
            }
        }
        return max_depth;
    }
}