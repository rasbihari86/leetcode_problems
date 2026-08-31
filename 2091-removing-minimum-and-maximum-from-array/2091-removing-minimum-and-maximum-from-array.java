class Solution {
    public int minimumDeletions(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }
        int minele = Integer.MAX_VALUE;
        int maxele = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            minele = Math.min(minele, nums[i]);
            maxele = Math.max(maxele, nums[i]);

        }
        int maxindex = -1;
        int minindex = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == maxele) {
                maxindex = i;

            }
            if (nums[i] == minele) {
                minindex = i;
            }
        }

            int rightcount = -1 ;
            int leftcount = -1 ;
            int fromboth = -1 ;

            if (minindex >= 0 && maxindex >= 0) {
                 rightcount = Math.max(maxindex, minindex)+1;

                 leftcount = nums.length - Math.min(maxindex, minindex);
                 fromboth = Math.min(maxindex, minindex) + 1
                        + nums.length - Math.max(maxindex, minindex);

            }
        

        return Math.min(rightcount , Math.min(leftcount , fromboth));

    }
}