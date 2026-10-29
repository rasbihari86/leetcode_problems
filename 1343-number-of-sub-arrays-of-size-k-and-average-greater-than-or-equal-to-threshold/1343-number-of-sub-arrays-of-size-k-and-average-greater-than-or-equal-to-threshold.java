class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0 ;
        int left = 0;
        int right = 0 ;

        int targetSum = threshold * k ;
        for(right = 0 ; right<k ; right++){
            sum = sum + arr[right];
           


        }
         if(sum>=targetSum){
                count++;
            }
        


        while(right<arr.length){
            sum = sum + arr[right];
            sum = sum - arr[left];
             if(sum>=targetSum){
                count++;
            }

            right++;
            left++;


        }

        return count;
        
    }
}