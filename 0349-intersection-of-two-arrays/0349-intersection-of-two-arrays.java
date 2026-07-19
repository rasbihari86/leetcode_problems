class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        for(int n : nums1){
            set1.add(n);
        }
        for(int k : nums2){
            if(set1.contains(k)){
                set2.add(k);
            }

        }
        int [] arr2 = new int[set2.size()];
        int i = 0;
        for(int j : set2){
            arr2[i++]=j;

        }
        return arr2;
        
    }
}