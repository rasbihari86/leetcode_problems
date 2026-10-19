class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int minMoves = 0;

        for(int i = 0 ; i< nums.length ; i++){
            int diff = Math.abs(median - nums[i]);
            minMoves = minMoves + diff;


        }

        return minMoves;


    }
}