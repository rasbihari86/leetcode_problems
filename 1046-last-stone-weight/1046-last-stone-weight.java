class Solution {
    public int lastStoneWeight(int[] stones) {
        boolean loop = true;
        if(stones.length == 1){return stones[0];}
        else if(stones.length ==2){
            int res = stones[0] - stones[1];
            return Math.abs(res);
        };


        while (loop) {
            int xmax = 0;
            int ymax = 0;
            int yidx = 0;
            int xidx = 0;
            int count = 0;
            for (int i = 0; i < stones.length; i++) {
                if (stones[i] > 0) {
                    count++;
                }
                if (stones[i] > ymax) {
                    xmax = ymax;
                    xidx = yidx;

                    ymax = stones[i];
                    yidx = i;
                } else if (stones[i] > xmax) {
                    xmax = stones[i];
                    xidx = i;
                }
            }
               if (count <= 1) {
                loop = false;
                break;
            }
            int y = ymax - xmax;
            stones[yidx] = y;
            stones[xidx] = 0;

           
        }
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] > 0) {
                return stones[i];
            }
        }
        return 0;
    }
}