class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int largestelement = 0 ;

        int smallest = Integer.MAX_VALUE;

        for(int i = 0 ; i< nums.length ; i++){
            largestelement = Math.max(nums[i], largestelement);

        }
        int start = 1 ;
        int end = largestelement ;
        while(start <= end){
            int mid = start +( end - start )/2 ;
            int divisorsum = divisor(nums , mid );
            

            if(divisorsum <= threshold ){
                smallest = Math.min(smallest ,mid) ;
                end = mid - 1;
            } 
             else if(divisorsum > threshold){
                start = mid + 1;

             } else {
                end = mid - 1;
             }
        }

        return smallest ;

        
        
    }

    public static int divisor( int [] nums , int d){
        int sum = 0 ;
        for(int i = 0 ; i< nums.length ; i++){
            int di  = (int) Math.ceil((double) nums[i] / d);
            sum = sum + di ;
        }

        return sum ;


    }

    
}