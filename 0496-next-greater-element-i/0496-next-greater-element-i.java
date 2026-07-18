class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : nums2){
            list.add(n);
        }
        int cnt = 0;
        int [] res = new int[nums1.length];

        for(int i = 0 ; i<nums1.length ; i++){
            int n = nums1[i];
            int idx = list.indexOf(n);
            
            int nextgreater= -1;
            while(idx <list.size()){
                if(list.get(idx)>n){
                    nextgreater = list.get(idx); 
                    
                    break ;

                }

                idx++;
                
               
            }
            res[i] = nextgreater;

        
             
            



        }
        return res ;

        
    }
}