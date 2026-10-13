class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
         int minsum =Integer.MAX_VALUE ;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    int distance = Math.abs( sum - target);
                    if(distance<min){
                        minsum =sum;
                        min = distance;
                    }
                    right--;

                    

                } else {
                    int distance = Math.abs(sum - target);
                     if(distance<min){
                        minsum =sum;
                        min = distance;
                    }


                    left++;
                }
            }

        }

        return minsum;

    }
}