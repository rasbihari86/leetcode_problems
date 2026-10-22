class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minlen = Integer.MAX_VALUE;
        int sum = 0 ;
        int left = 0;
        for(int right = 0 ; right<nums.length ; right++){
            sum = sum  +  nums[right];
            if(sum>=target){
                minlen = Math.min(minlen , right - left +1);
            }

            while(sum>=target){
                 minlen = Math.min(minlen , right - left +1);
                 sum = sum - nums[left];
                 left++; 
            }
        }
        if(minlen == Integer.MAX_VALUE){
            return 0;
        }else{
            return minlen ;
        }
        

        
    }
}