class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String , Integer> map = new HashMap<>();
        HashMap<String , Integer> map2 = new HashMap<>();
        int count = 0;
       for(String s : words1){
        map.put(s,map.getOrDefault(s,0)+1);
       }
        for(String s : words2){
        map2.put(s,map2.getOrDefault(s,0)+1);
       }

       for(int i = 0 ; i<words1.length ; i++){
        if(map2.containsKey(words1[i])){
            if(map.get(words1[i])==1 && map.get(words1[i])==map2.get(words1[i])){
                count++;
            }
        }
       }

       return count;
        
        
    }
}