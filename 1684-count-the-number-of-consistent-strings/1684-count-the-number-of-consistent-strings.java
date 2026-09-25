class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0 ;
        for(int j = 0 ; j< words.length ; j++){
            String word = words[j];
            for(int i = 0 ; i< word.length() ; i++){
                if(!allowed.contains(word.charAt(i)+"")){
                    break;
                }else{
                    if(i == word.length() -1){
                        count++;
                    }
                }

            }
        }
        return count ;
    }
}