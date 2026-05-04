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
                char[] w=word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    w[i]=ch;
                    String temp=new String(w);
                    if(set.contains(temp)){
                        q.add(new Pair(temp,steps+1));
                        set.remove(temp);
                    }
                }
            }
        }
        return 0;
    }
}