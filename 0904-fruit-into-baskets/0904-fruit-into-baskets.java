class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer ,Integer> map = new HashMap<>();
      int left = 0;
      int max = 0 ;
      for(int right = 0 ; right<nums.length ; right++){
        map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
         while(map.size()>2 && left< nums.length){
             map.put(nums[left], map.getOrDefault(nums[left], 0)-1);
             if(map.get(nums[left])==0){
                map.remove(nums[left]);
             }
             left++;

         }

         max = Math.max(max , right - left + 1);

         
        }

        return max;
      
       
       
        
    }
}