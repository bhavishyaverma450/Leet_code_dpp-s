class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b)->b[1]-a[1]);
        int units=0;

        for(int[] box:boxTypes){
            int boxes=Math.min(box[0],truckSize);
            units+= boxes*box[1];
            truckSize-=boxes;
            if(truckSize==0)break;
        }
        return units;
    }
}