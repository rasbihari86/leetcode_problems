class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int [] prefix = new int[nums.size()];
        prefix[0] = nums.get(0);

       for(int i = 1 ; i< nums.size() ; i++){
             prefix[i] = prefix[i-1] + nums.get(i);

       }

       int left = 0 ;
       int right = l;
       while(left<nums.size()){
        int cnt = l ;
        right = left+l-1;
        
        while(cnt<=r && right<nums.size()){
            int sum = 0;
            if(left==0){
                sum = prefix[right];
            }else{
                sum = prefix[right] - prefix[left-1];
            }

            if(sum>0){
                ans = Math.min(sum,ans);
            }
                
            right++;
            cnt++;
        }
        left++;
        

       }
       if(ans==Integer.MAX_VALUE){
        return -1 ;
       }

       return ans;
        
    }
}