// this is using string builder
class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<n;i++)
        {
            sb.setCharAt(indices[i],s.charAt(i));
        }
        return sb.toString();
    }
}
// this is using string
// class Solution {
//     public String restoreString(String s, int[] indices) {
//         int n = s.length();
//         char[] res = new char[n];
//         for(int i=0;i<n;i++)
//         {
//             res[i]=indices[indices[i]];
//         }
//         return res;
//     }
// }