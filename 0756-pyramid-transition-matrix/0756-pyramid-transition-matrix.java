class Solution {
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        Map<String,List<Character>> map = new HashMap<>();
        for(String s:allowed){
            String Key = s.substring(0,2);
            char val = s.charAt(2);
            if(!map.containsKey(Key)){
                map.put(Key,new ArrayList<>());
            }
            map.get(Key).add(val);
        } 
        StringBuilder sb = new StringBuilder();
        return backtrack(bottom,map,sb,0);
    }
    public boolean backtrack(String bottom, Map<String,List<Character>> map, StringBuilder sb,int idx){
        if(bottom.length()==1){
            return true;
        }
        if(sb.length()==bottom.length()-1){
            return backtrack(sb.toString(),map,new StringBuilder(),0);
        }
        String key = bottom.substring(idx,idx+2);
        if(!map.containsKey(key))return false;
        for(char ch:map.get(key)){
            sb.append(ch);
            if(backtrack(bottom,map,sb,idx+1)){
                return true;
            }
            sb.deleteCharAt(sb.length()-1);
        }
        return false;
    }
}