//using string
// class Solution {
//     public String defangIPaddr(String address) {
//         String str = address.replace(".","[.]");
//         return str;
//     }
// }

//using string builder
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for(char i:address.toCharArray())
        {
            if(i == '.')
            {
                sb.append("[.]");
            }else{
                sb.append(i);
            }
        }
    return sb.toString();
    }
}