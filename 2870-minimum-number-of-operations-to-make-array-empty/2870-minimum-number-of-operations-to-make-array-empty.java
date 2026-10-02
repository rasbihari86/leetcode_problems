class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getKey();
            int freq = entry.getValue();
            while ( freq > 1) {
                if (freq % 3 == 0) {
                   freq = freq-3 ;
                    count++;
                } else if (freq % 2 == 0) {
                    freq = freq -2 ;
                    count++;
                } else {
                    // freq is odd and not divisible by 3
                    freq -= 2;
                    count++;
                }

            }
             if (freq == 1) {
                return -1;
            }
        }
      
        return count;
    }
}