class Solution {
    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length();i++){
            int number = getVal(s.charAt(i));
            total+=number;
            if(i>0){
                int last = getVal(s.charAt(i-1));
                if(number>last){
                    total -= (2*last);
                }
            }
        }
        return total;
    }
    public int getVal(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }

    }
}