class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int it:stones)list.add(it);
        return solve(list);
    }
    public int solve(ArrayList<Integer> stones){
        if(stones.size()==0)return 0;
        if(stones.size()==1)return stones.get(0);

        Collections.sort(stones);
        int y=stones.remove(stones.size()-1);
        int x=stones.remove(stones.size()-1);

        if(y!=x)stones.add(y-x);
        return solve(stones);
    }
}