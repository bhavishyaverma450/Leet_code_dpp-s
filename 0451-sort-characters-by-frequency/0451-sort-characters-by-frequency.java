class Solution {
    public int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        int maxi =-1;
        for(int i=0;i<256;i++){
            if(arr[i]>max){
                max=arr[i];
                maxi=i;
            }
        }
        return maxi;
    }
    public String frequencySort(String s) {
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        int i=0;
        char[] res = new char[s.length()];
        while(i<s.length()){
            int maxi = findMax(freq);
            while(freq[maxi]>0){
                res[i++]=(char)maxi;
                freq[maxi]--;
            }
        }
        return new String(res);
    }
}