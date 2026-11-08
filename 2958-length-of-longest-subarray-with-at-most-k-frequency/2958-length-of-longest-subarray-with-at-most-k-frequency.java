class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxsize = 0;
        int left = 0;
        for(int right = 0 ; right < nums.length ; right++){
            map.put(nums[right], map.getOrDefault(nums[right], 0)+1);
        
           

            while(map.get(nums[right]) > k && left<nums.length){
                map.put(nums[left], map.getOrDefault(nums[left], 0)-1);
                left++;
            }

            maxsize = Math.max(right-left + 1 , maxsize);
        }
        

        return maxsize;
    }
}