class Solution {
    public int[] searchRange(int[] nums, int target) {
       int [] result =  new int[2];
       result[0] = firstoc(nums,target);
       result[1] = lastoc(nums,target);

       return result;


    }

    public static int firstoc(int [] nums , int target){
        int start = 0 ;
        int end = nums.length - 1;
        int firstocc = -1 ;
        while(start<= end){
            int mid = start + (end - start)/2;

            if(nums[mid]==target){
                firstocc = mid ;
                end = mid - 1;

            }else if(target>nums[mid]){
                start = mid + 1;

            }else {
                end = mid - 1;
            }
        }
        return firstocc;

    }

    public static int lastoc(int [] nums , int target){

       int start = 0 ;
        int end = nums.length - 1;
        int lastocc = -1 ;
        while(start<=end){
            int mid = start + (end - start)/2;

            if(target == nums[mid]){
                lastocc = mid;
                start = mid + 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid -1 ;
            }

        }
        return lastocc;

    }
}