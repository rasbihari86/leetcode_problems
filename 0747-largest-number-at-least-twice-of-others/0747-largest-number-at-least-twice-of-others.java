class Solution {
    public int dominantIndex(int[] nums) {
        int firstMaximum = 0;
        int secondmaximum = 0;
        int index =0 ;
        for(int i = 0 ; i< nums.length ; i++){
            if(nums[i]>firstMaximum){
                secondmaximum = firstMaximum;
                firstMaximum = nums[i];
                index = i ;


            }else if(nums[i]<firstMaximum && nums[i]>secondmaximum){
                secondmaximum = nums[i];
            }
        }

        if(firstMaximum>=(secondmaximum*2)){
            return  index ;
        }else{
            return -1;
        }
        
    }
}