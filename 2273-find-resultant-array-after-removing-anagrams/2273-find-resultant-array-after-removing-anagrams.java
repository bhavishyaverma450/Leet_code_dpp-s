class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev="";
        List<String> list=new ArrayList<>();

        for(String word:words){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);

            if(!str.equals(prev)){
                list.add(word);
                prev=str;
            }
        }
        return list;
    }
}