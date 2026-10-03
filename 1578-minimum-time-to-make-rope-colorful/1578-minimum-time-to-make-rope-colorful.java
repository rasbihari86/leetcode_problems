class Solution {
    public int minCost(String colors, int[] neededTime) {
       int min = 0 ;

     int left = 0 ;
     int right = 1 ;
     while(left<neededTime.length && right<neededTime.length){
        if(colors.charAt(right-1)!=colors.charAt(right)){
            int max = 0 ;
            int sum = 0;
        while(left<right){
        max = Math.max(max , neededTime[left]);
        sum = sum + neededTime[left];
        left++;
        }
        min = min + (sum - max) ;
        max = 0;
        sum = 0;
        }

        right++;
        

        
        
     }
          // Process the last group
        int max = 0;
        int sum = 0;

        while (left < neededTime.length) {
            max = Math.max(max, neededTime[left]);
            sum += neededTime[left];
            left++;
        }

        min += sum - max;

        return min;
    
    }
    
}