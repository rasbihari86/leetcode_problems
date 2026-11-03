class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String>[] list = new ArrayList[words.length+2];

        for( String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String word : map.keySet()){
            int val = map.get(word);
            if(list[val]==null){
                list[val] = new ArrayList<>();
                
            }

            list[val].add(word);
        }
        for(int i = 0; i < list.length; i++) {
            if(list[i] != null) {
                Collections.sort(list[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        int counter = 0;
        for(int i = list.length-1 ; i>=0 && counter <k ; i--){
            if(list[i]!=null){
            for(String bucketString : list[i]){
                ans.add(bucketString);
                counter++;
                if(counter==k){
                    break;
                }
            }
            }


        }
       
    
    return ans ;
        
    }
}