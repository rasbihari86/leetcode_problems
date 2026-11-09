class Solution {
    public int longestSubarray(int[] nums) {

        if(nums.length <=2){
            return nums.length;
        }
        
        int max = 0;
        int left = 1 ;
        int right = 2;
        int s = 0; // this pointer keeps track of current 
                       //starting index of fibbonaci series
        while(right<nums.length){
            s = left -1 ;
            while(right< nums.length && nums[right]-nums[left]==nums[left-1] ){
                max = Math.max(right-s+1 ,max);
                right++;
                left++;

            }
            right++;
            left++;
        }

        if(max>2){
            return max;
        }

        return 2;
    }
}