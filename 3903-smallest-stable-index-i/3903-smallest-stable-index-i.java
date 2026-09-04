class Solution {
    public int firstStableIndex(int[] nums, int t) {
        
      for(int i = 0 ; i< nums.length ; i++){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int j = 0 ; j<=i ; j++){
            max = Math.max(nums[j], max);

        }
        for(int k = i  ; k<nums.length ; k++){
            min = Math.min(nums[k] , min);
        }

        int diff = max-min ;
        if(diff<=t){
            return i ;
        }
      }

      return -1;
    }
}