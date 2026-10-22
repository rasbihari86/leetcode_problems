class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int minlen = Integer.MAX_VALUE;
      int left = 0;
     
      int sum = 0;

      for(int right  = 0 ; right<nums.length ; right++){
        sum = sum + nums[right];
        if(sum>=target){
            minlen = Math.min(minlen , right -left +1);
            while(sum>=target ){
                sum = sum - nums[left];
                 minlen = Math.min(minlen , right -left +1);
                 left++;

            }
            
        }

      }
     

      if(minlen == Integer.MAX_VALUE){
        return 0;
      }
      return minlen;
        

        
    }
}