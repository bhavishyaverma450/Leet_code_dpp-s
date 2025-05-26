class Solution {
    public int minAddToMakeValid(String s) {
        int openBrackets=0;
        int min=0;

        for(char ch:s.toCharArray()){
            if(ch=='('){
                openBrackets++;
            }else{
                if(openBrackets>0){
                    openBrackets--;
                }else{
                    min++;
                }
            }
        }
        return min+openBrackets;
    }
}