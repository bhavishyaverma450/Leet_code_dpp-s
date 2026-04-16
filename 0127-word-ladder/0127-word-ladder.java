class Solution {
    class Pair{
        String first;
        int second;
        Pair(String first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set=new HashSet<>();
        for(String s:wordList){
            set.add(s);
        }
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        set.remove(beginWord);

        while(!q.isEmpty()){
            String word=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(word.equals(endWord))return steps;
            
            for(int i=0;i<word.length();i++){
                char[] replacedArray=word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    replacedArray[i]=ch;
                    String str=new String(replacedArray);
                    if(set.contains(str)){
                        q.add(new Pair(str,steps+1));
                        set.remove(str);
                    }
                }
            }
        }
        return 0;
    }
}