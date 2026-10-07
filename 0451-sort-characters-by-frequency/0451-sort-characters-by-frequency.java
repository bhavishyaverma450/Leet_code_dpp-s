class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[256];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        char[] res=new char[s.length()];
        int i=0;
        while(i<s.length()){
            int maxInd=findInd(freq);
            while(freq[maxInd]>0){
                res[i++]=(char)maxInd;
                freq[maxInd]--;
            }
        }
        return new String(res);
    }
    public int findInd(int[] freq){
        int index=-1;
        int maxEle=Integer.MIN_VALUE;
        for(int i=0;i<256;i++){
            if(freq[i]>maxEle){
                maxEle=freq[i];
                index=i;
            }
        }
        return index;
    }
}