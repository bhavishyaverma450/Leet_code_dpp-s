class Solution {
    public int romanToInt(String s) {
        int res = getValue(s.charAt(s.length()-1));

        for(int i=s.length()-2;i>=0;i--){
            int num1 = getValue(s.charAt(i));
            int num2 = getValue(s.charAt(i+1));
            if(num1<num2){
                res -=num1;
            }else if(num1>=num2){
                res+=num1;
            }
        }
        return res;
    }
    public int getValue(char num){
        switch(num){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}