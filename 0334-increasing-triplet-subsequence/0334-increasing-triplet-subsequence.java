class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = Integer.MAX_VALUE;
        int j = Integer.MAX_VALUE;
        

    for(int ii = 0 ; ii<nums.length ; ii++){
        if( nums[ii]<=i){
           i = nums[ii];
        }else if(nums[ii]<=j){
            j = nums[ii];
        }else {
            return true;
        }
    }
    return false ;
        
    }
}