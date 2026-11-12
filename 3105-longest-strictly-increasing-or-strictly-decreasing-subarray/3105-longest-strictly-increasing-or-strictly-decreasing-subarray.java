class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int left = 0 ;
        int maxlen = 1;
        int right=1;
        while(right<nums.length){
            if(right<nums.length && nums[right]>nums[right-1]){
                left = right-1;
                
         while(right<nums.length && nums[right]>nums[right-1]){
            
            maxlen = Math.max(right-left+1,maxlen);
            right++;
         }
            }

         else if(right<nums.length && nums[right]<nums[right-1]){
            left = right-1;
            
         while(right<nums.length && nums[right]<nums[right-1] ){
             
             maxlen = Math.max(right-left+1,maxlen);
            right++;
         }

         }else{
            left= right;
            right++;
         }

        
            
        }

        return maxlen;
        
    }
}