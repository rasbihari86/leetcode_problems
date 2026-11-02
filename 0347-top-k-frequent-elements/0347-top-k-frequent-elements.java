class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
       ArrayList<Integer>[] list = new ArrayList[nums.length + 1];

       for(int i = 0 ; i<nums.length ; i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
       }

       for(int key : map.keySet()){
        int freq = map.get(key);
        if(list[freq]==null){
            list[freq] = new ArrayList<>();
        }
        list[freq].add(key);
       }

       int [] resarray = new int[k];
       int counter = 0;

       for(int i = list.length-1 ; i>=0 && counter<k ; i--){
          if(list[i]!=null){
            for( int  n : list[i]){
                resarray[counter]=n;
                counter++;
                if(counter==k)break;

            }
          }
       }
       return resarray;


        
    }
}