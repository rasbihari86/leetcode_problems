class Solution {
    public int findMaxLength(int[] nums) {

        // we have to convert 0 to -1 and then use prefix sum 
        // if at any point 
        int len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefix = new int[nums.length];
        map.put(0,-1);
        if (nums[0] == 0) {
            prefix[0] = -1;
            map.put(0,-1);
        } else {
            prefix[0] = 1;
             
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                prefix[i] = prefix[i - 1] - 1;
            } else {
                prefix[i] = prefix[i - 1] + 1;
            }

        }



        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(prefix[i])) {
                int idx = map.get(prefix[i]);

                len = Math.max(len, i - idx);
            }else{
                map.put(prefix[i], i);
            }

            
        }

        return len;

    }
}