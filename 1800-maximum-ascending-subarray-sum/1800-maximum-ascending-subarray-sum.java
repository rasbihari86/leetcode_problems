class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum = 0 ;
        int currentsum = 0 ;
        int left = 0;
        int right = 0 ;
    
      while( right < nums.length){
       if(right==0){
        currentsum = currentsum + nums[right];
      
       }else if(nums[right-1]<nums[right]){
         currentsum = currentsum + nums[right];
        
       }else{
         currentsum = nums[right] ;
         
       }

         maxsum = Math.max(maxsum , currentsum);
         right++;
      }

      return maxsum;
        
    }
}