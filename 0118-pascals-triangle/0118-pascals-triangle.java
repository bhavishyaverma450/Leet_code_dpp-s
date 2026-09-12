class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    list.get(i).add(1);
                }else{
                    int temp=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                    list.get(i).add(temp);
                }
            }
        }
        return list;
    }
}