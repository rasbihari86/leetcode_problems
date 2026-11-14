class Solution {
    public int findMiddleIndex(int[] nums) {
       int totalsum = 0;
     int leftsum = 0 ;
     int rightsum = 0;
       for (int num : nums) {
            totalsum += num;
        }

     for(int  i = 0 ; i<nums.length ; i++){
        
        rightsum = totalsum - leftsum - nums[i];

        if(rightsum==leftsum){
            return i;
        }

        leftsum = leftsum + nums[i];

     }

     return -1;
          
    }
}