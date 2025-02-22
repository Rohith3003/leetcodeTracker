class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double, Long> ratioMap = new HashMap<>();
        long res=0;
        for(int[] rectangle: rectangles) {
            double ratio = (double)rectangle[0]/rectangle[1];
            long freq = ratioMap.getOrDefault(ratio, 0l);
            ratioMap.put(ratio, freq+1);
            res+=freq;
        }

        return res;
    }
}