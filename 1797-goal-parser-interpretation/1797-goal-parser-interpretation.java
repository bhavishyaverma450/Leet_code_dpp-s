
//using string
class Solution {
    public String interpret(String command) {
        String str = command.replace("(al)","al").replace("()","o");
        return str;
    }
}