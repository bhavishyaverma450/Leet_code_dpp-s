class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int h = n/2;
        int firstStr = count(s,0,h);
        int secondStr = count(s,h,n);
        return firstStr == secondStr;
        
    }
    public static int count(String s,int start,int end)
    {
        int count=0;
        for(int i=start;i<end;i++)
        {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
            ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                count++;
            }
        }
        return count;
    }
}