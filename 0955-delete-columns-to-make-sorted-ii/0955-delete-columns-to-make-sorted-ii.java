class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int w = strs[0].length();

        String[] curr = new String[n];
        int cnt = 0;
        for(int j = 0; j < w; j++){
            String[] temp = new String[n];
            for(int i = 0; i < n; i++){
                temp[i] = curr[i] + strs[i].substring(j, j + 1);
            }

            if(isLexi(temp)){
                curr = temp;
            }
            else{
                cnt++;
            }
        }

        return cnt;
    }

    private boolean isLexi(String[] strs){
        for(int i = 1; i < strs.length; i++){
            if(strs[i].compareTo(strs[i - 1]) < 0) return false;
        }
        return true;
    }
}