class Solution {
    List<List<String>> res=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char[][] board=new char[n][n];
        for(char[] ch:board){
            Arrays.fill(ch,'.');
        }
        solve(board,0,n);
        return res;
    }
    public void solve(char[][] board,int row,int n){
        if(row==n){
            res.add(construct(board));
            return;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col]='Q';
                solve(board,row+1,n);
                board[row][col]='.';
            }
        }
    }
    public boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q')return false;
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q')return false;
        }
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q')return false;
        }
        return true;
    }
    public List<String> construct(char[][] board){
        List<String> list=new ArrayList<>();
        for(char[] row:board){
            list.add(new String(row));
        }
        return list;
    }
}