class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
       
        for(int i = 0 ; i< nums.length ; i++){
            set.add(nums[i]);

        }

        for(int i = 0 ; i<nums.length ; i++){
            int reversed = reverse(nums[i]);
            set.add(reversed);
            
        }


    

     return set.size();        
    }
     public int reverse(int num){
            int newnum = 0 ;
            while(num>0){
                int lastdigit = num%10;
                newnum = newnum * 10 + lastdigit ;
                num = num/10;

            }
            return newnum ;
        }
}