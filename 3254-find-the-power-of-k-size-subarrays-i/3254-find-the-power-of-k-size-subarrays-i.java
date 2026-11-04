class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length ;
        int idx = 0;
        int[] newarr = new int[nums.length - k + 1];
        for (int left = 0; left <= n - k; left++) {

            int right = left;
            int count = 1;
            while (count < k) {

                if (nums[right - 1+1] == nums[right+1] - 1) {
                    count++;
                    right++;

                } else {

                    break;
                }

            }

            if (count == k) {
                newarr[idx++] = nums[right];

            } else {
                newarr[idx++] = -1;
            }

           

        }
        return newarr;
    }
}