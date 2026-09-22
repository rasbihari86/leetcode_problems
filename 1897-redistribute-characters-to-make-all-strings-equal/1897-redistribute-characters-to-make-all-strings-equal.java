class Solution {
    public boolean makeEqual(String[] words) {
        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i< words.length ; i++){
            for(char c : words[i].toCharArray()){
                map.put(c , map.getOrDefault(c,0)+1);
            }
        }
        int n = words.length ;
        for(int v : map.values()){
            if(v%n!=0){
                return false;
            }
        }

        return true;

    }
}